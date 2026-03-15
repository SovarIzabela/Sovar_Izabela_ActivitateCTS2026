package FactoryMethod.Exercitiul7.Classes;

import java.util.ArrayList;
import java.util.List;

public class FTunningSport implements Ifactory {
    @Override
    public AMasina creazaMasina(String marca, String sasiu, List<String> listaServiciiTunning) {
        return new TunningSport( marca,  sasiu, new ArrayList<>(listaServiciiTunning));
    }
}
