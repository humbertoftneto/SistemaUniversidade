package Model;

import java.sql.Timestamp;

public class FaculdadesBEAN {
    private int idFaculdade;
    private String descricaoFaculdade;
    private int situacaoFaculdade;
    private Timestamp ultimaAtualizacao;

    public FaculdadesBEAN(int idFaculdade, String descricaoFaculdade, int situacaoFaculdade, Timestamp ultimaAtualizacao) {
        this.idFaculdade = idFaculdade;
        this.descricaoFaculdade = descricaoFaculdade;
        this.situacaoFaculdade = situacaoFaculdade;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public FaculdadesBEAN(String descricaoFaculdade, int situacaoFaculdade, Timestamp ultimaAtualizacao) {
        this.descricaoFaculdade = descricaoFaculdade;
        this.situacaoFaculdade = situacaoFaculdade;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public String getDescricaoFaculdade() {
        return descricaoFaculdade;
    }

    public void setDescricaoFaculdade(String descricaoFaculdade) {
        this.descricaoFaculdade = descricaoFaculdade;
    }

    public int getSituacaoFaculdade() {
        return situacaoFaculdade;
    }

    public void setSituacaoFaculdade(int situacaoFaculdade) {
        this.situacaoFaculdade = situacaoFaculdade;
    }

    public int getIdFaculdade() {
        return idFaculdade;
    }

    public Timestamp getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(Timestamp ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    
    
    
}
