package exercitiul1.Classes;

public class AreServetele {

    private int numarMasaCuServetele;
    private int numarLocuriMasaCuSeretele;

    public AreServetele(int numarMasaCuServetele, int numarLocuriMasaCuSeretele) {
        this.numarMasaCuServetele = numarMasaCuServetele;
        this.numarLocuriMasaCuSeretele = numarLocuriMasaCuSeretele;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AreServetele{");
        sb.append("numarMasaCuServetele=").append(numarMasaCuServetele);
        sb.append(", numarLocuriMasaCuSeretele=").append(numarLocuriMasaCuSeretele);
        sb.append('}');
        return sb.toString();
    }

    public boolean areServetele(int masa){
        return true;
    }


}
