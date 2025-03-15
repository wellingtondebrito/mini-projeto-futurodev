package br.senai.futurodev.mapeamentoareaverde.models;

import java.util.UUID;

public class Localizacao {
    private int id;
    private String latitude;
    private String longitude;
    private int idAreaVerde;

    public Localizacao(String latitude, String longitude) {

        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Localizacao(){}

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "Localização{" +
                "id=" + this.id +
                ", latitude=" + this.latitude +
                ", longitude=" + this.longitude +
                ", idÁreaVerde=" + this.idAreaVerde +
                '}';

    }



}
               