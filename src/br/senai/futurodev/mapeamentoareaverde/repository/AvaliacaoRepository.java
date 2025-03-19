package br.senai.futurodev.mapeamentoareaverde.repository;

import br.senai.futurodev.mapeamentoareaverde.models.Avaliacao;

import java.util.ArrayList;
import java.util.List;

public class AvaliacaoRepository {

    private static final List<Avaliacao> AVALIACOES = new ArrayList<>();

    public void salvarAvaliacao(Avaliacao avaliacao) {
        avaliacao.setId(AVALIACOES.size() + 1);
        AVALIACOES.add(avaliacao);
    }

    public Avaliacao buscarAvaliacao(int id) {
        for (Avaliacao avaliacao : AVALIACOES) {
            if (avaliacao.getId() == id) {
                return avaliacao;
            }
        }
        return null;
    }

    public List<Avaliacao> listarAvaiacoes() {
        return AVALIACOES;
    }

}
