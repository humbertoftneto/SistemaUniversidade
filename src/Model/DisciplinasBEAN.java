package Model;
import java.sql.Timestamp;

public class DisciplinasBEAN {
    private int idDisciplina;
    private String descricaoDisciplina;
    private int situacaoDisciplina;
    private Timestamp ultimaAtualizacao;
    private int idFaculdade;

    public DisciplinasBEAN(int idDisciplina, String descricaoDisciplina, int situacaoDisciplina, Timestamp ultimaAtualizacao,int idFaculdade) {
        this.idDisciplina = idDisciplina;
        this.descricaoDisciplina = descricaoDisciplina;
        this.situacaoDisciplina = situacaoDisciplina;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.idFaculdade = idFaculdade;
    }

    public DisciplinasBEAN(String descricaoDisciplina, int situacaoDisciplina, Timestamp ultimaAtualizacao, int idFaculdade) {
        this.descricaoDisciplina = descricaoDisciplina;
        this.situacaoDisciplina = situacaoDisciplina;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.idFaculdade = idFaculdade;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getDescricaoDisciplina() {
        return descricaoDisciplina;
    }

    public void setDescricaoDisciplina(String descricaoDisciplina) {
        this.descricaoDisciplina = descricaoDisciplina;
    }

    public int getSituacaoDisciplina() {
        return situacaoDisciplina;
    }

    public void setSituacaoDisciplina(int situacaoDisciplina) {
        this.situacaoDisciplina = situacaoDisciplina;
    }

    public Timestamp getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(Timestamp ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    
    public int getIdFaculdade() {
        return idFaculdade;
    }

    public void setIdFaculdade(int idFaculdade) {
        this.idFaculdade = idFaculdade;
    }
//    @Override
//    public String toString(){
//        return this.descricaoDisciplina;
//    }
}