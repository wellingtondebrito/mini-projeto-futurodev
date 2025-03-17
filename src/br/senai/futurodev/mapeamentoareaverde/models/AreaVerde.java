package br.senai.futurodev.mapeamentoareaverde.models;

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

    public String toString(){
        return "Nome: " + this.nome + "\nHorário de Funcionamento: " + this.horarioFuncionamento + "\nTipo de Vegetação: " + this.tipoDeVegetacao + "\nAtividades: " + this.atividades + "\nCoordenadas: " + this.coordenadas.getLatitude() + this.coordenadas.getLongitude();
    }
}
