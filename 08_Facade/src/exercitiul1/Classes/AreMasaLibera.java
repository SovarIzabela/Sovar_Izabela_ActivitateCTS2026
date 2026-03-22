package exercitiul1.Classes;

public class AreMasaLibera {

    private int numarMasaLibera;
    private int numarLocuriMasaLibera;

    public AreMasaLibera(int numarMasaLibera, int numarLocuriMasaLibera) {
        this.numarMasaLibera = numarMasaLibera;
        this.numarLocuriMasaLibera = numarLocuriMasaLibera;
    }

    public boolean areMasaLibera(int masa){
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AreMasaLibera{");
        sb.append("numarMasaLibera=").append(numarMasaLibera);
        sb.append(", numarLocuriMasaLibera=").append(numarLocuriMasaLibera);
        sb.append('}');
        return sb.toString();
    }
}
