package Model;

public class AlunosBEAN {

    private int matriculaAluno;
    private String nomeAluno;
    private String cpfAluno;
    private int situacaoAluno;

    public AlunosBEAN(int matriculaAluno, String nomeAluno, String cpfAluno, int situacaoAluno) {
        this.matriculaAluno = matriculaAluno;
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.situacaoAluno = situacaoAluno;
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

    public int getMatriculaAluno() {
        return matriculaAluno;
    }
    
}
