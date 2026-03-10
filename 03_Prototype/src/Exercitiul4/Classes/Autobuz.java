package Exercitiul4.Classes;

import java.util.ArrayList;
import java.util.List;

public class Autobuz extends AMijlocTransport {


    public Autobuz(String firma, String model, int anProductie, int nrLocuri, boolean esteElectric, List<Integer> nrLiniiTransport) {
        super(firma, model, anProductie, nrLocuri, esteElectric, nrLiniiTransport);
    }

    public Autobuz() {

    }

    @Override
    public AMijlocTransport clone() {
        AMijlocTransport clona = new Autobuz();
        ((Autobuz)clona).firma = this.firma;
        ((Autobuz)clona).model = this.model;
        ((Autobuz)clona).anProductie = this.anProductie;
        ((Autobuz)clona).nrLocuri = this.nrLocuri;
        ((Autobuz)clona).esteElectric = this.esteElectric;
        clona.nrLiniiTransport= new ArrayList<>(this.nrLiniiTransport);

        return clona;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("firma='").append(firma).append('\'');
        sb.append(", anProductie=").append(anProductie);
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", esteElectric=").append(esteElectric);
        sb.append(", nrLiniiTransport=").append(nrLiniiTransport);
        sb.append('}');
        return sb.toString();
    }
}
