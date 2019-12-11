package Model;
public class FaculdadesBEAN {
    private int idFaculdade;
    private String descricaoFaculdade;
    private int situacaoFaculdade;

    public FaculdadesBEAN(int idFaculdade, String descricaoFaculdade, int situacaoFaculdade) {
        this.idFaculdade = idFaculdade;
        this.descricaoFaculdade = descricaoFaculdade;
        this.situacaoFaculdade = situacaoFaculdade;
    }

    public FaculdadesBEAN(String descricaoFaculdade, int situacaoFaculdade) {
        this.descricaoFaculdade = descricaoFaculdade;
        this.situacaoFaculdade = situacaoFaculdade;
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
    
    
}
