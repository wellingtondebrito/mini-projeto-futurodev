package br.senai.futurodev.mapeamentoareaverde.main;

import br.senai.futurodev.mapeamentoareaverde.models.Localizacao;
import br.senai.futurodev.mapeamentoareaverde.repository.LocalizacaoRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Localizacao loc = new Localizacao();
        Scanner entrada = new Scanner(System.in);
        LocalizacaoRepository localizacoes = new LocalizacaoRepository();

        System.out.println("Digite a latitude: ");
        String latitude = entrada.nextLine();
        System.out.println("Digite a longitude: ");
        String longitude = entrada.nextLine();

        loc.setLatitude(latitude);
        loc.setLongitude(longitude);


        localizacoes.salvarLocalizacao(loc);
        System.out.println("Localização salva com sucesso!");
        System.out.println("Localização: " + loc.toString());

    }
}
