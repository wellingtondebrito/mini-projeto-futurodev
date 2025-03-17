package br.senai.futurodev.mapeamentoareaverde.main;

import br.senai.futurodev.mapeamentoareaverde.models.Avaliacao;
import br.senai.futurodev.mapeamentoareaverde.models.Localizacao;
import br.senai.futurodev.mapeamentoareaverde.repository.AvaliacaoRepository;
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
       // System.out.println("Localização é: " + localizacoes.buscarLocalizacao(1));

//        Avaliacao avaliacao = new Avaliacao();
//        AvaliacaoRepository avaliacoes = new AvaliacaoRepository();

//        System.out.println("Digite a nota para a quantidade de árvores: ");
//        double notaArvores = Double.parseDouble(entrada.nextLine());
//        System.out.println("Digite a nota para a qualidade do ar: ");
//        double notaQualidadeAr = Double.parseDouble(entrada.nextLine());
//        System.out.println("Digite a nota para a coleta de residuos: ");
//        double notaColetaResiduos = Double.parseDouble(entrada.nextLine());
//        System.out.println("Digite a nota para a poluicao sonora: ");
//        double notaPoluicaoSonora = Double.parseDouble(entrada.nextLine());
//        System.out.println("Digite a nota para o transporte publico: ");
//        double notaTransportePublico = Double.parseDouble(entrada.nextLine());

//        avaliacao.setQldDoAr(notaQualidadeAr);
//        avaliacao.setQtdArvores(notaArvores);
//        avaliacao.setColetaDeResiduos(notaColetaResiduos);
//        avaliacao.setTransportePublico(notaTransportePublico);
//        avaliacao.setAusenciaPoluicaoSonora(notaPoluicaoSonora);
//
//        System.out.println("Notas registradas com sucesso!");
//        avaliacoes.salvarAvaliacao(avaliacao);
//        System.out.println(avaliacao.toString());
        //System.out.println(avaliacoes.buscarAvaliacao(2));

    }
}
