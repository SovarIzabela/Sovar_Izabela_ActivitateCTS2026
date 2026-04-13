package exercitiul4.Classes;

import java.util.ArrayList;
import java.util.List;

public class Tramvai extends AMijlocTransport{


    public Tramvai(String firma, String model, int anProductie, int nrLocuri, boolean esteElectric, List<Integer> nrLiniiTransport) {
        super(firma, model, anProductie, nrLocuri, esteElectric, nrLiniiTransport);
    }

    public Tramvai() {

    }

    @Override
    public AMijlocTransport clone() {
        AMijlocTransport clona = new Tramvai();
        ((Tramvai)clona).firma = this.firma;
        ((Tramvai)clona).model = this.model;
        ((Tramvai)clona).anProductie = this.anProductie;
        ((Tramvai)clona).nrLocuri = this.nrLocuri;
        ((Tramvai)clona).esteElectric = this.esteElectric;
        clona.nrLiniiTransport= new ArrayList<>(this.nrLiniiTransport);

        return clona;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
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
