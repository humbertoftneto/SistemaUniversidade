package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FaculdadesDAO {
        private static FaculdadesDAO instance;

    private FaculdadesDAO() {
        MySQLDAO.getConnection();
    }

    public static FaculdadesDAO getInstance() {
        if (instance == null) {
            instance = new FaculdadesDAO();
        }
        return instance;
    }
    public long create(FaculdadesBEAN faculdade) {
        String query = "INSERT INTO faculdade (descricaoFaculdade, situacaoFaculdade) VALUES (?,?)";
        return MySQLDAO.executeQuery(query, faculdade.getDescricaoFaculdade(), faculdade.getSituacaoFaculdade());
    }

    public void update(FaculdadesBEAN faculdade) {
        String query = "UPDATE faculdade SET descricaoFaculdade=?, situacaoFaculdade=? WHERE idFaculdade = ?";
        MySQLDAO.executeQuery(query, faculdade.getDescricaoFaculdade(), faculdade.getSituacaoFaculdade(), faculdade.getIdFaculdade());
    }

    public ArrayList<FaculdadesBEAN> findAllFaculdade() {
        return listaFaculdades("SELECT * FROM faculdade ORDER BY idFaculdade");
    }

    public ArrayList<FaculdadesBEAN> listaFaculdades(String query) {
        ArrayList<FaculdadesBEAN> lista = new ArrayList<FaculdadesBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new FaculdadesBEAN(rs.getInt("idFaculdade"), rs.getString("descricaoFaculdade"), rs.getInt("situacaoFaculdade")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public FaculdadesBEAN findFaculdade(int idFaculdade) {
        FaculdadesBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM faculdade WHERE idFaculdade=?", idFaculdade);
        try {
            if (rs.next()) {
                result = new FaculdadesBEAN(rs.getInt("idFaculdade"), rs.getString("descricaoFaculdade"), rs.getInt("situacaoFaculdade"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findIdFaculdade(FaculdadesBEAN faculdade) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM faculdade WHERE descricaoFaculdade= ? and situacaoFaculdade= ?", faculdade.getDescricaoFaculdade(), faculdade.getSituacaoFaculdade());
        try {
            if (rs.next()) {
                result = rs.getInt("idFaculdade");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExistFaculdade(int idFaculdade) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM faculdade WHERE idFaculdade= ?", idFaculdade);
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
