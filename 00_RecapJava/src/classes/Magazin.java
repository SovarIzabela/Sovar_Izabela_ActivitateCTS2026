package classes;

public abstract class Magazin {

    private String denumireMagazin;
    private int nrAngajati;
    private String adresa;

    public static final String TARA = "Romania";
    private static int nrMagazine;


    public abstract void afiseazaMagazin();


    public Magazin(String denumireMagazin, int nrAngajati, String adresa) {
        this.denumireMagazin = denumireMagazin;
        this.nrAngajati = nrAngajati;
        this.adresa = adresa;
        nrMagazine++;
    }

    public static int getNrMagazine() {
        return nrMagazine;
    }

    public String getDenumireMagazin() {
        return denumireMagazin;
    }

    public void setDenumireMagazin(String denumireMagazin) {
        this.denumireMagazin = denumireMagazin;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }


    public String afiseazaComun() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("denumireMagazin='").append(denumireMagazin).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
