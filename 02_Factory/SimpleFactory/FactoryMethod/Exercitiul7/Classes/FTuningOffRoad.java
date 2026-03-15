package FactoryMethod.Exercitiul7.Classes;

import java.util.ArrayList;
import java.util.List;

public class FTuningOffRoad implements Ifactory{
    @Override
    public AMasina creazaMasina(String marca, String sasiu, List<String> listaServiciiTunning) {
        return new TunningOffRoad(marca, sasiu, new ArrayList<>(listaServiciiTunning));
    }
}
