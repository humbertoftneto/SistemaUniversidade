package Model;
public class TurmasBEAN {
    private int idTurma;
    private String descricaoTurma;
    private String semestreTurma;
    private int situacaoTurma;
    private int idProfessor;
    private int idDisciplina;

    public TurmasBEAN(int idTurma, String descricaoTurma, String semestreTurma, int situacaoTurma, int idProfessor, int idDisciplina) {
        this.idTurma = idTurma;
        this.descricaoTurma = descricaoTurma;
        this.semestreTurma = semestreTurma;
        this.situacaoTurma = situacaoTurma;
        this.idProfessor = idProfessor;
        this.idDisciplina = idDisciplina;
    }

    public String getDescricaoTurma() {
        return descricaoTurma;
    }

    public void setDescricaoTurma(String descricaoTurma) {
        this.descricaoTurma = descricaoTurma;
    }

    public String getSemestreTurma() {
        return semestreTurma;
    }

    public void setSemestreTurma(String semestreTurma) {
        this.semestreTurma = semestreTurma;
    }

    public int getSituacaoTurma() {
        return situacaoTurma;
    }

    public void setSituacaoTurma(int situacaoTurma) {
        this.situacaoTurma = situacaoTurma;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getIdTurma() {
        return idTurma;
    }
    
    
}
