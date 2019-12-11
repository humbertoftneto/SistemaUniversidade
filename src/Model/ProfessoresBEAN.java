package Model;

import java.sql.Timestamp;
import java.util.Date;

public class ProfessoresBEAN {

    private int idProfessor;
    private String nomeProfessor;
    private String cpfProfessor;
    private int situacaoProfessor;
    private Timestamp ultimaAtualizacao;

    public ProfessoresBEAN(int idProfessor, String nomeProfessor, String cpfProfessor, int situacaoProfessor, Timestamp ultimaAtualizacao) {
        this.idProfessor = idProfessor;
        this.nomeProfessor = nomeProfessor;
        this.cpfProfessor = cpfProfessor;
        this.situacaoProfessor = situacaoProfessor;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public ProfessoresBEAN(String nomeProfessor, String cpfProfessor, int situacaoProfessor, Timestamp ultimaAtualizacao) {
        this.nomeProfessor = nomeProfessor;
        this.cpfProfessor = cpfProfessor;
        this.situacaoProfessor = situacaoProfessor;
        this.ultimaAtualizacao = ultimaAtualizacao;
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

    public Timestamp getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(Timestamp ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

}
