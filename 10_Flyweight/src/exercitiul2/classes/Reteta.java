package exercitiul2.classes;

public class Reteta {

    private String numarReteta;
    private float sumaDePlata;
    private int numarMedicamente;

    public Reteta(String numarReteta, float sumaDePlata, int numarMedicamente) {
        this.numarReteta = numarReteta;
        this.sumaDePlata = sumaDePlata;
        this.numarMedicamente = numarMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numarReteta='").append(numarReteta).append('\'');
        sb.append(", sumaDePlata=").append(sumaDePlata);
        sb.append(", numarMedicamente=").append(numarMedicamente);
        sb.append('}');
        return sb.toString();
    }
}


