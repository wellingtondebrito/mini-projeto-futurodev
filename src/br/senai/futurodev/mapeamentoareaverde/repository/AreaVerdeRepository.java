package br.senai.futurodev.mapeamentoareaverde.repository;

import br.senai.futurodev.mapeamentoareaverde.models.AreaVerde;

import java.util.ArrayList;
import java.util.List;

public class AreaVerdeRepository {

    private static final List<AreaVerde> AREAS_VERDES = new ArrayList<>();

    public void salvarAreaVerde(AreaVerde areaVerde) {
        areaVerde.setId(AREAS_VERDES.size() + 1);
        AREAS_VERDES.add(areaVerde);
    }

    public AreaVerde buscarAreaVerde(int id) {
        for (AreaVerde areaVerde : AREAS_VERDES) {
            if (areaVerde.getId() == id) {
                return areaVerde;
            }
        }
        return null;
    }

    public List<AreaVerde> listarAreasVerdes() {
        return AREAS_VERDES;
    }
}
