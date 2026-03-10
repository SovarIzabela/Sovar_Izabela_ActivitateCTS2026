package Exercitiul4.Classes;

import java.util.ArrayList;
import java.util.List;

public class Troleibuz extends AMijlocTransport{


    public Troleibuz(String firma, String model, int anProductie, int nrLocuri, boolean esteElectric, List<Integer> nrLiniiTransport) {
        super(firma, model, anProductie, nrLocuri, esteElectric, nrLiniiTransport);
    }

    public Troleibuz() {

    }

    @Override
    public AMijlocTransport clone() {
        AMijlocTransport clona = new Troleibuz();
        ((Troleibuz)clona).firma = this.firma;
        ((Troleibuz)clona).model = this.model;
        ((Troleibuz)clona).anProductie = this.anProductie;
        ((Troleibuz)clona).nrLocuri = this.nrLocuri;
        ((Troleibuz)clona).esteElectric = this.esteElectric;
        clona.nrLiniiTransport= new ArrayList<>(this.nrLiniiTransport);

        return clona;


    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("firma='").append(firma).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", anProductie=").append(anProductie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", esteElectric=").append(esteElectric);
        sb.append(", nrLiniiTransport=").append(nrLiniiTransport);
        sb.append('}');
        return sb.toString();
    }
}
