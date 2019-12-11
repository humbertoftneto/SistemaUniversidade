package Model;
import java.util.Date;
public class ProfessoresBEAN {
private int idProfessor;
private String nomeProfessor;
private String cpfProfessor;
private int situacaoProfessor;

    public ProfessoresBEAN(int idProfessor, String nomeProfessor, String cpfProfessor, int situacaoProfessor) {
        this.idProfessor = idProfessor;
        this.nomeProfessor = nomeProfessor;
        this.cpfProfessor = cpfProfessor;
        this.situacaoProfessor = situacaoProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getCpfProfessor() {
        return cpfProfessor;
    }

    public void setCpfProfessor(String cpfProfessor) {
        this.cpfProfessor = cpfProfessor;
    }

    public int getSituacaoProfessor() {
        return situacaoProfessor;
    }

    public void setSituacaoProfessor(int situacaoProfessor) {
        this.situacaoProfessor = situacaoProfessor;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
    

    

}