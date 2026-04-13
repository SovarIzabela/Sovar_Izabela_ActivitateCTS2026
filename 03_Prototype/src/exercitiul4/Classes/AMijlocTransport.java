package exercitiul4.Classes;

import java.util.List;

public abstract class AMijlocTransport {

    protected String firma;
    protected String model;
    protected int anProductie;
    protected int nrLocuri;
    protected boolean esteElectric;
    public List<Integer> nrLiniiTransport;

    public AMijlocTransport(String firma, String model, int anProductie, int nrLocuri, boolean esteElectric, List<Integer> nrLiniiTransport) {
        this.firma = firma;
        this.model = model;
        this.anProductie = anProductie;
        this.nrLocuri = nrLocuri;
        this.esteElectric = esteElectric;
        this.nrLiniiTransport = nrLiniiTransport;
    }


    public AMijlocTransport() {
    }

    public abstract AMijlocTransport clone();
}
