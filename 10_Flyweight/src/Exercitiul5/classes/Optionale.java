package Exercitiul5.classes;

public class Optionale {

    private int numarSalon;
    private int nrPat;
    private int numarZileSpitalizare;

    public Optionale(int numarSalon, int nrPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.nrPat = nrPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public int getNumarSalon() {
        return numarSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public int getNumarZileSpitalizare() {
        return numarZileSpitalizare;
    }

    @Override
    public String toString() {
        return "Optionale{" +
                "numarSalon=" + numarSalon +
                ", nrPat=" + nrPat +
                ", numarZileSpitalizare=" + numarZileSpitalizare +
                '}';
    }
}
