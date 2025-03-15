package br.senai.futurodev.mapeamentoareaverde.repository;

import br.senai.futurodev.mapeamentoareaverde.models.Localizacao;

import java.util.ArrayList;
import java.util.List;

public class LocalizacaoRepository {
    private static final List<Localizacao> LOCALIZACOES = new ArrayList<>();

    public void salvarLocalizacao(Localizacao localizacao) {
        localizacao.setId(LOCALIZACOES.size() + 1);
        LOCALIZACOES.add(localizacao);
    }

    public Localizacao buscarLocalizacao(int id) {
        for (Localizacao localizacao : LOCALIZACOES) {
            if (localizacao.getId() == id) {
                return localizacao;
            }
        }
        return null;
    }


}


