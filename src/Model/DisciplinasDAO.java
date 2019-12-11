package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class DisciplinasDAO {
    private static DisciplinasDAO instance;

    private DisciplinasDAO() {
        MySQLDAO.getConnection();
    }

    public static DisciplinasDAO getInstance() {
        if (instance == null) {
            instance = new DisciplinasDAO();
        }
        return instance;
    }
    public long create(DisciplinasBEAN disciplina) {
        String query = "INSERT INTO disciplina (descricaoDisciplina, situacaoDisciplina, ultimaAtualizacao, idFaculdade) VALUES (?,?,?,?)";
        return MySQLDAO.executeQuery(query, disciplina.getDescricaoDisciplina(), disciplina.getSituacaoDisciplina(), disciplina.getUltimaAtualizacao(),disciplina.getIdFaculdade());
    }

    public void update(DisciplinasBEAN disciplina) {
        String query = "UPDATE disciplina SET descricaoDisciplina=?, situacaoDisciplina=?, ultimaAtualizacao=? ,idFaculdade=? WHERE idDisciplina = ?";
        MySQLDAO.executeQuery(query, disciplina.getDescricaoDisciplina(), disciplina.getSituacaoDisciplina(), disciplina.getUltimaAtualizacao(), disciplina.getIdFaculdade(), disciplina.getIdDisciplina());
    }

    public ArrayList<DisciplinasBEAN> findAllDisciplina() {
        return listaDisciplinas("SELECT * FROM disciplina ORDER BY idDisciplina");
    }

    public ArrayList<DisciplinasBEAN> listaDisciplinas(String query) {
        ArrayList<DisciplinasBEAN> lista = new ArrayList<DisciplinasBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new DisciplinasBEAN(rs.getInt("idDisciplina"), rs.getString("descricaoDisciplina"), rs.getInt("situacaoDisciplina"), rs.getTimestamp("ultimaAtualizacao"),rs.getInt("idFaculdade")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public DisciplinasBEAN findDisciplina(int idDisciplina) {
        DisciplinasBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM disciplina WHERE idDisciplina=?", idDisciplina);
        try {
            if (rs.next()) {
                result = new DisciplinasBEAN(rs.getInt("idDisciplina"), rs.getString("descricaoDisciplina"), rs.getInt("situacaoDisciplina"), rs.getTimestamp("ultimaAtualizacao"),rs.getInt("idFaculdade"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findIdDisciplina(DisciplinasBEAN disciplina) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM disciplina WHERE descricaoDisciplina= ? and situacaoDisciplina= ? and ultimaAtualizacao=? and idFaculdade= ?", disciplina.getDescricaoDisciplina(), disciplina.getSituacaoDisciplina(),disciplina.getIdFaculdade());
        try {
            if (rs.next()) {
                result = rs.getInt("idDisciplina");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExistDisciplina(int idDisciplina) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM disciplina WHERE idDisciplina= ?", idDisciplina);
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
