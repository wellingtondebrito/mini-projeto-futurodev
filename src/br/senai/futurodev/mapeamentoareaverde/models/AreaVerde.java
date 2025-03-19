package br.senai.futurodev.mapeamentoareaverde.models;

import br.senai.futurodev.mapeamentoareaverde.repository.AreaVerdeRepository;
import br.senai.futurodev.mapeamentoareaverde.repository.AvaliacaoRepository;

import java.util.ArrayList;
import java.util.List;

public class AreaVerde {

    private int id;
    private String nome;
    private String horarioFuncionamento;
    private String tipoDeVegetacao;
    private String atividades;
    private Localizacao coordenadas;
    private Avaliacao avaliacao;
    private double mediaGeral;


    public AreaVerde(String nome, String horarioFuncionamento, String tipoDeVegetacao, String atividades, Localizacao coordenadas) {
        this.nome = nome;
        this.horarioFuncionamento = horarioFuncionamento;
        this.tipoDeVegetacao = tipoDeVegetacao;
        this.atividades = atividades;
        this.coordenadas = coordenadas;
    }

    public AreaVerde(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getTipoDeVegetacao() {
        return tipoDeVegetacao;
    }

    public void setTipoDeVegetacao(String tipoDeVegetacao) {
        this.tipoDeVegetacao = tipoDeVegetacao;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

    public Localizacao getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Localizacao coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double calcularMediaGeral(AvaliacaoRepository avaliacao){
        double somaDasMedias = 0.0;
        int totalAvaliacoes = avaliacao.listarAvaiacoes().size();

        for (Avaliacao avaliacaoAtual : avaliacao.listarAvaiacoes()) {
            somaDasMedias += avaliacaoAtual.CalcularMedia();
        }

        if(totalAvaliacoes == 0){
            return 0.0;
        }
        this.mediaGeral = somaDasMedias / totalAvaliacoes;
        return somaDasMedias / totalAvaliacoes;

    }

    public String listAreaVerdeString(AvaliacaoRepository avaliacao){
        return  "Nome: " + this.nome +
                "\n--------------------------------------" +
                "\n 🕧 Horário de Funcionamento: "
                + this.horarioFuncionamento +
                "\n--------------------------------------" +
                "\n 🌳 Tipo de Vegetação: " + this.tipoDeVegetacao +
                "\n--------------------------------------" +
                "\n ⭐ Avaliação Geral:  " + calcularMediaGeral(avaliacao)+
                "\n--------------------------------------";
    }

    public String toString(AvaliacaoRepository avaliacao){
        return "Detalhes da Área Verde" +
                "\n--------------------------------------" +
                "Nome: " + this.nome +
                "\n--------------------------------------" +
                "\n 🕧 Horário de Funcionamento: "
                + this.horarioFuncionamento +
                "\n--------------------------------------" +
                "\n 🌳 Tipo de Vegetação: " + this.tipoDeVegetacao +
                "\n--------------------------------------" +
                "\n 🏃‍♂️‍➡️ Atividades: " + this.atividades +
                "\n--------------------------------------" +
                "\n 📌 Coordenadas: "
                +"Latitude: " + this.coordenadas.getLatitude() + " e " +
                 "Longitude: " + this.coordenadas.getLongitude() +
                "\n--------------------------------------" +
                "\n ⭐ Avaliação Geral:  " + calcularMediaGeral(avaliacao)+
                "\n--------------------------------------";
    }
}
