package Model;

import java.sql.Timestamp;

public class AlunosBEAN {

    private int matriculaAluno;
    private String nomeAluno;
    private String cpfAluno;
    private int situacaoAluno;
    private Timestamp ultimaAtualizacao;

    public AlunosBEAN(int matriculaAluno, String nomeAluno, String cpfAluno, int situacaoAluno, Timestamp ultimaAtualizacao) {
        this.matriculaAluno = matriculaAluno;
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.situacaoAluno = situacaoAluno;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public AlunosBEAN(String nomeAluno, String cpfAluno, int situacaoAluno, Timestamp ultimaAtualizacao) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.situacaoAluno = situacaoAluno;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public int getSituacaoAluno() {
        return situacaoAluno;
    }

    public void setSituacaoAluno(int situacaoAluno) {
        this.situacaoAluno = situacaoAluno;
    }

    public Timestamp getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(Timestamp ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }
    
}
