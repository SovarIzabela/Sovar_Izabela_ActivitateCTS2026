package Exercitiul5.Classes;

public class Tramvai implements IMijlocTransport{

    private String firma;
    private String model;
    private String anProductie;
    private int nrLocuri;
    private boolean esteElectric;

    public Tramvai(String firma, String model, String anProductie, int nrLocuri, boolean esteElectric) {
        this.firma = firma;
        this.model = model;
        this.anProductie = anProductie;
        this.nrLocuri = nrLocuri;
        this.esteElectric = esteElectric;
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un Tramvai");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("firma='").append(firma).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", anProductie='").append(anProductie).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", esteElectric=").append(esteElectric);
        sb.append('}');
        return sb.toString();
    }
}
