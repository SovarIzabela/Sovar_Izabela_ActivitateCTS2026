package exercitiul10.classes;

public class Rezervare {

    private String tipMasa;
    private String tipRezervare;
    private int numarLocuri;

    public Rezervare(String tipMasa, String tipRezervare, int numarLocuri) {
        this.tipMasa = tipMasa;
        this.tipRezervare = tipRezervare;
        this.numarLocuri = numarLocuri;
    }

    public String getTipMasa() {
        return tipMasa;
    }

    public String getTipRezervare() {
        return tipRezervare;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "tipMasa='" + tipMasa + '\'' +
                ", tipRezervare='" + tipRezervare + '\'' +
                ", numarLocuri=" + numarLocuri +
                '}';
    }
}
