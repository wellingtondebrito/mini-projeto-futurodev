package br.senai.futurodev.mapeamentoareaverde.models;


public class Avaliacao {
    private int id;
    private double qtdArvores;
    private double qldDoAr;
    private double ausenciaPoluicaoSonora;
    private double coletaDeResiduos;
    private double transportePublico;
    private int idAreaVerde;

    public Avaliacao(double qtdArvores, double qldDoAr, double ausenciaPoluicaoSonora, double coletaDeResiduos, double transportePublico) {
        this.qtdArvores = qtdArvores;
        this.qldDoAr = qldDoAr;
        this.ausenciaPoluicaoSonora = ausenciaPoluicaoSonora;
        this.coletaDeResiduos = coletaDeResiduos;
        this.transportePublico = transportePublico;
    }

    public Avaliacao(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAreaVerde() {
        return idAreaVerde;
    }

    public void setIdAreaVerde(int idAreaVerde) {
        this.idAreaVerde = idAreaVerde;
    }

    public double getQtdArvores() {
        return qtdArvores;
    }

    public void setQtdArvores(double qtdArvores) {
        this.qtdArvores = qtdArvores;
    }

    public double getQldDoAr() {
        return qldDoAr;
    }

    public void setQldDoAr(double qldDoAr) {
        this.qldDoAr = qldDoAr;
    }

    public double getAusenciaPoluicaoSonora() {
        return ausenciaPoluicaoSonora;
    }

    public void setAusenciaPoluicaoSonora(double ausenciaPoluicaoSonora) {
        this.ausenciaPoluicaoSonora = ausenciaPoluicaoSonora;
    }

    public double getColetaDeResiduos() {
        return coletaDeResiduos;
    }

    public void setColetaDeResiduos(double coletaDeResiduos) {
        this.coletaDeResiduos = coletaDeResiduos;
    }

    public double getTransportePublico() {
        return transportePublico;
    }

    public void setTransportePublico(double transportePublico) {
        this.transportePublico = transportePublico;
    }

    public double CalcularMedia(){
        double media = (this.qtdArvores + this.qldDoAr + this.ausenciaPoluicaoSonora + this.coletaDeResiduos + this.transportePublico) / 5;
        return media;
    }

    public String toString(){
        return "Avaliação{" +
                "id=" + this.id +
                ", qtdArvores=" + this.qtdArvores +
                ", qldDoAr=" + this.qldDoAr +
                ", ausenciaPoluicaoSonora=" + this.ausenciaPoluicaoSonora +
                ", coletaDeResiduos=" + this.coletaDeResiduos +
                ", transportePublico=" + this.transportePublico +
                ", idÁreaVerde=" + this.idAreaVerde +
                ", Média=" + CalcularMedia() +
                '}';
    }
}
