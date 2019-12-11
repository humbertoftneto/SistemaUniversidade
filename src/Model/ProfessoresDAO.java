package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProfessoresDAO {

    private static ProfessoresDAO instance;

    private ProfessoresDAO() {
        MySQLDAO.getConnection();
    }

    public static ProfessoresDAO getInstance() {
        if (instance == null) {
            instance = new ProfessoresDAO();
        }
        return instance;
    }

    public long create(ProfessoresBEAN professor) {
        String query = "INSERT INTO PROFESSOR (nomeProfessor, cpfProfessor, situacaoProfessor, ultimaAtualizacao) VALUES (?,?,?,?)";
        return MySQLDAO.executeQuery(query, professor.getNomeProfessor(), professor.getCpfProfessor(), professor.getSituacaoProfessor(), professor.getUltimaAtualizacao());
    }

    public void update(ProfessoresBEAN professor) {
        String query = "UPDATE PROFESSOR SET nomeProfessor=?, cpfProfessor=?, situacaoProfessor=?, ultimaAtualizacao=? WHERE idProfessor = ?";
        MySQLDAO.executeQuery(query, professor.getNomeProfessor(), professor.getCpfProfessor(), professor.getSituacaoProfessor(), professor.getUltimaAtualizacao(), professor.getIdProfessor());
    }

    public ArrayList<ProfessoresBEAN> findAllProfessor() {
        return listaProfessores("SELECT * FROM professor ORDER BY idProfessor");
    }

    public ArrayList<ProfessoresBEAN> listaProfessores(String query) {
        ArrayList<ProfessoresBEAN> lista = new ArrayList<ProfessoresBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new ProfessoresBEAN(rs.getInt("idProfessor"), rs.getString("nomeProfessor"), rs.getString("cpfProfessor"),
                        rs.getInt("situacaoProfessor"), rs.getTimestamp("ultimaAtualizacao")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ProfessoresBEAN findProfessor(int idProfessor) {
        ProfessoresBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM Contatos WHERE idProfessor=?", idProfessor);
        try {
            if (rs.next()) {
                result = new ProfessoresBEAN(rs.getInt("idProfessor"), rs.getString("nomeProfessor"), rs.getString("cpfProfessor"), rs.getInt("situacaoProfessor"), rs.getTimestamp("ultimaAtualizacao"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findIdProfessor(ProfessoresBEAN professor) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM contatos WHERE nomeProfessor= ? and cpfProfessor= ?and situacaoProfessor = ? and ultimaAtualizacao = ?", professor.getNomeProfessor(), professor.getCpfProfessor(), professor.getSituacaoProfessor(), professor.getUltimaAtualizacao());
        try {
            if (rs.next()) {
                result = rs.getInt("idProfessor");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExistProfessor(int idProfessor) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM Contatos WHERE idProfessor= ?", idProfessor);
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
