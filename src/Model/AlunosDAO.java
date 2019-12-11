package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunosDAO {
    private static AlunosDAO instance;

    private AlunosDAO() {
        MySQLDAO.getConnection();
    }

    public static AlunosDAO getInstance() {
        if (instance == null) {
            instance = new AlunosDAO();
        }
        return instance;
    }
    public long create(AlunosBEAN aluno) {
        String query = "INSERT INTO aluno (nomeAluno, cpfAluno, situacaoAluno, ultimaAtualizacao) VALUES (?,?,?,?)";
        return MySQLDAO.executeQuery(query, aluno.getNomeAluno(), aluno.getCpfAluno(), aluno.getSituacaoAluno(), aluno.getUltimaAtualizacao());
    }

    public void update(AlunosBEAN aluno) {
        String query = "UPDATE aluno SET nomeAluno=?, cpfAluno=?, situacaoAluno=?, ultimaAtualizacao=? WHERE matriculaAluno = ?";
        MySQLDAO.executeQuery(query, aluno.getNomeAluno(), aluno.getCpfAluno(), aluno.getSituacaoAluno(), aluno.getUltimaAtualizacao(), aluno.getMatriculaAluno());
    }

    public ArrayList<AlunosBEAN> findAllAluno() {
        return listaAlunos("SELECT * FROM aluno ORDER BY matriculaAluno");
    }

    public ArrayList<AlunosBEAN> listaAlunos(String query) {
        ArrayList<AlunosBEAN> lista = new ArrayList<AlunosBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new AlunosBEAN(rs.getInt("matriculaAluno"), rs.getString("nomeAluno"), rs.getString("cpfAluno"), rs.getInt("situacaoAluno"), rs.getTimestamp("ultimaAtualizacao")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public AlunosBEAN findAluno(int matriculaAluno) {
        AlunosBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM aluno WHERE matriculaAluno=?", matriculaAluno);
        try {
            if (rs.next()) {
                result = new AlunosBEAN(rs.getInt("matriculaAluno"), rs.getString("nomeAluno"), rs.getString("cpfAluno"), rs.getInt("situacaoAluno"), rs.getTimestamp("ultimaAtualizacao"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findMatriculaAluno(AlunosBEAN aluno) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM aluno WHERE nomeAluno= ? and cpfAluno= ? and situacaoAluno= ? and ultimaAtualizacao=?", aluno.getNomeAluno(), aluno.getCpfAluno(), aluno.getSituacaoAluno(), aluno.getUltimaAtualizacao());
        try {
            if (rs.next()) {
                result = rs.getInt("matriculaAluno");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExistAluno(int matriculaAluno) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM aluno WHERE matriculaAluno= ?", matriculaAluno);
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
