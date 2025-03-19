package br.senai.futurodev.mapeamentoareaverde.main;

import br.senai.futurodev.mapeamentoareaverde.models.AreaVerde;
import br.senai.futurodev.mapeamentoareaverde.models.Avaliacao;
import br.senai.futurodev.mapeamentoareaverde.models.Localizacao;
import br.senai.futurodev.mapeamentoareaverde.repository.AreaVerdeRepository;
import br.senai.futurodev.mapeamentoareaverde.repository.AvaliacaoRepository;
import br.senai.futurodev.mapeamentoareaverde.repository.LocalizacaoRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        AreaVerdeRepository areasVerdes = new AreaVerdeRepository();
        AvaliacaoRepository avaliacoes = new AvaliacaoRepository();

        int opcao = 0;

        do{
            System.out.println("Bem-vindo ao Mapeamento de Áreas Verdes! Escolha uma opção para iniciar:");
            System.out.println("----------------------------------------");
            System.out.println("1 - para Listar uma Area Verde");
            System.out.println("----------------------------------------");
            System.out.println("2 - para avaliar uma Area Verde");
            System.out.println("----------------------------------------");
            System.out.println("3 - Ver detalhes de uma Area Verde");
            System.out.println("----------------------------------------");
            System.out.println("4 - Cadastrar nova Área Verde");
            System.out.println("----------------------------------------");
            System.out.println("0 - Sair");
            opcao = Integer.parseInt(entrada.nextLine());
            switch (opcao){
                case 1:
                    System.out.println("Listando Áreas Verdes...");
                    for (AreaVerde area : areasVerdes.listarAreasVerdes()) {
                        System.out.println( " - ID: " + area.getId() + " Nome: " + area.getNome());
                    }
                    break;
                case 2:
                    System.out.println("Digite o ID da Área Verde que deseja avaliar:");
                    int id = Integer.parseInt(entrada.nextLine());
                    int areaVerde = areasVerdes.buscarAreaVerde(id).getId();
                    AreaVerde area_verde = new AreaVerde();

                    if(id == areaVerde){

                        Avaliacao avaliacao = new Avaliacao();
                        System.out.println("Digite uma nota de 1 a 5 para quantidade de árvores:");
                        avaliacao.setQtdArvores(Double.parseDouble(entrada.nextLine()));
                        System.out.println("----------------------------------------");
                        System.out.println("Digite uma nota de 1 a 5 para a qualidade do ar");
                        avaliacao.setQldDoAr(Double.parseDouble(entrada.nextLine()));
                        System.out.println("----------------------------------------");
                        System.out.println("Digite uma nota de 1 a 5 para a para classificar a poluição sonora:");
                        avaliacao.setAusenciaPoluicaoSonora(Double.parseDouble(entrada.nextLine()));
                        System.out.println("----------------------------------------");
                        System.out.println("Digite uma nota de 1 a 5 para a para classificar a coleta de resíduos:");
                        avaliacao.setColetaDeResiduos(Double.parseDouble(entrada.nextLine()));
                        System.out.println("----------------------------------------");
                        System.out.println("Digite uma nota de 1 a 5 para a para classificar a facilidade de acesso:");
                        avaliacao.setTransportePublico(Double.parseDouble(entrada.nextLine()));
                        System.out.println("----------------------------------------");
                        avaliacao.setIdAreaVerde(areaVerde);
                        avaliacoes.salvarAvaliacao(avaliacao);
                        area_verde.setAvaliacao(avaliacao);
                        System.out.println("----------------------------------------");
                        System.out.println(" ✅ Avaliação realizada com sucesso!");
                        System.out.println("----------------------------------------");

                    } else{
                        System.out.println("----------------------------------------");
                        System.out.println(" ❌ Ops! Área Verde não encontrada!");
                        System.out.println("----------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Digite o ID da Área Verde que deseja ver detalhes:");
                    int idArea = Integer.parseInt(entrada.nextLine());
                    AreaVerde area = areasVerdes.buscarAreaVerde(idArea);
                    if (area != null) {
                        System.out.println(area.toString(avaliacoes));
                    } else {
                        System.out.println("----------------------------------------");
                        System.out.println(" ❌ Ops! Área Verde não encontrada!");
                        System.out.println("----------------------------------------");
                    }
                    break;
                case 4:
                    System.out.println("Cadastrando nova Área Verde...");
                    System.out.println("----------------------------------------");
                    System.out.println("Digite o nome da Área Verde:");
                    String nome = entrada.nextLine();
                    System.out.println("----------------------------------------");
                    System.out.println("Digite o horário de funcionamento:");
                    String horario = entrada.nextLine();
                    System.out.println("----------------------------------------");
                    System.out.println("Digite o tipo de vegetação:");
                    String vegetacao = entrada.nextLine();
                    System.out.println("----------------------------------------");
                    System.out.println("Digite as atividades:");
                    String atividades = entrada.nextLine();
                    System.out.println("----------------------------------------");
                    System.out.println("Digite a latitude:");
                    String latitude = entrada.nextLine();
                    System.out.println("----------------------------------------");
                    System.out.println("Digite a longitude:");
                    String longitude = entrada.nextLine();
                    System.out.println("----------------------------------------");
                    LocalizacaoRepository localizacoes = new LocalizacaoRepository();
                    Localizacao localizacao = new Localizacao();
                    localizacao.setLongitude(longitude);
                    localizacao.setLatitude(latitude);
                    AreaVerde novaArea = new AreaVerde();
                    novaArea.setNome(nome);
                    novaArea.setTipoDeVegetacao(vegetacao);
                    novaArea.setCoordenadas(localizacao);
                    novaArea.setAtividades(atividades);
                    novaArea.setHorarioFuncionamento(horario);
                    localizacoes.salvarLocalizacao(localizacao);
                    localizacao.setIdAreaVerde(novaArea.getId());
                    areasVerdes.salvarAreaVerde(novaArea);
                    System.out.println("----------------------------------------");
                    System.out.println("✅ Área Verde cadastrada com sucesso!");
                    System.out.println("----------------------------------------");
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o Mapeamento de Áreas Verdes!");
                    break;
                default:
                    System.out.println("❌ Opção inválida!");
                    break;
            }
        }while(opcao != 0);

    }
}
