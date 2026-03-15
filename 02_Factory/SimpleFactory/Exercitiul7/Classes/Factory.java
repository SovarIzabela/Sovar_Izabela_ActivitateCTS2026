package Exercitiul7.Classes;


import java.util.ArrayList;
import java.util.List;

public class Factory {

    public AMasina intoarceMasina(TipTunning tip,String marca, String sasiu, List<String> listaServiciiTunning ) throws Exception {
        switch (tip){
            case luxury: return new TunningLuxury(marca, sasiu, new ArrayList<>(listaServiciiTunning));
            case sport: return new TunningSport(marca, sasiu, new ArrayList<>(listaServiciiTunning));
            case offRoad:return new TunningOffRoad(marca, sasiu, new ArrayList<>(listaServiciiTunning));
            default:throw new Exception("Nu este un tuning valid");
        }
    }

}
