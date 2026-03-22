package exercitiul1.Classes;

public class AfostDebarasata {

    private int numarMasaDebarasata;
    private int numarLocuriMasaDebarasata;

    public AfostDebarasata(int numarMasaDebarasata, int numarLocuriMasaDebarasata) {
        this.numarMasaDebarasata = numarMasaDebarasata;
        this.numarLocuriMasaDebarasata = numarLocuriMasaDebarasata;
    }

    public boolean aFostDebarasata(int masa){
        return true;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AfostDebarasata{");
        sb.append("numarMasaDebarasata=").append(numarMasaDebarasata);
        sb.append(", numarLocuriMasaDebarasata=").append(numarLocuriMasaDebarasata);
        sb.append('}');
        return sb.toString();
    }
}
