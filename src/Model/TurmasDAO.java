package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TurmasDAO {
     private static TurmasDAO instance;

    private TurmasDAO() {
        MySQLDAO.getConnection();
    }

    public static TurmasDAO getInstance() {
        if (instance == null) {
            instance = new TurmasDAO();
        }
        return instance;
    }

    public long create(TurmasBEAN turma) {
        String query = "INSERT INTO turma (descricaoTurma, semestreTurma, situacaoTurma, idProfessor, idDisciplina) VALUES (?,?,?,?,?)";
        return MySQLDAO.executeQuery(query, turma.getDescricaoTurma(), turma.getSemestreTurma(), turma.getSituacaoTurma(), turma.getIdProfessor(), turma.getIdDisciplina());
    }

    public void update(TurmasBEAN turma) {
        String query = "UPDATE turma SET discricaoTurma=?, semestreTurma=?, situacaoTurma=?, idProfessor=?, idDisciplina=? WHERE idTurma = ?";
        MySQLDAO.executeQuery(query, turma.getDescricaoTurma(), turma.getSemestreTurma(), turma.getSituacaoTurma(), turma.getIdProfessor(), turma.getIdDisciplina(), turma.getIdTurma());
    }

    public ArrayList<TurmasBEAN> findAllTurma() {
        return listaTurmas("SELECT * FROM turma ORDER BY idTurma");
    }

    public ArrayList<TurmasBEAN> listaTurmas(String query) {
        ArrayList<TurmasBEAN> lista = new ArrayList<TurmasBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new TurmasBEAN(rs.getInt("idTurma"), rs.getString("descricaoTurma"), rs.getString("semestreTurma"), rs.getInt("situacaoTurma"), rs.getInt("idProfessor"), rs.getInt("idDisciplina")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public TurmasBEAN findTurma(int idTurma) {
        TurmasBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM turma WHERE idTurma=?", idTurma);
        try {
            if (rs.next()) {
                result = new TurmasBEAN(rs.getInt("idTurma"), rs.getString("descricaoTurma"), rs.getString("semestreTurma"), rs.getInt("situacaoTurma"), rs.getInt("idProfessor"), rs.getInt("idDisciplina"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findIdTurma(TurmasBEAN turma) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM turma WHERE idTurma= ? and descricaoTurma= ? and semestreTurma= ? and situacaoTurma = ? and idProfessor= ? and idDisciplina= ?", turma.getDescricaoTurma(), turma.getSemestreTurma(), turma.getSituacaoTurma(), turma.getIdProfessor(), turma.getIdDisciplina());
        try {
            if (rs.next()) {
                result = rs.getInt("idTurma");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExistTurma(int idTurma) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM turma WHERE idTurma= ?", idTurma);
        try {
            if (rs.next()) {
                result = true;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
