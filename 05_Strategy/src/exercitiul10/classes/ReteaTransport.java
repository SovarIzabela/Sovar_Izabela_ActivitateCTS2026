package exercitiul10.classes;

public class ReteaTransport {

    private String oras;
    private int numarStatii;
    private int costStatie;


    public ReteaTransport(String oras, int numarStatii, int costStatie) {
        this.oras = oras;
        this.numarStatii = numarStatii;
        this.costStatie = costStatie;
    }


    public String getOras() {
        return oras;
    }

    public int getNumarStatii() {
        return numarStatii;
    }

    public int getCostStatie() {
        return costStatie;
    }

    @Override
    public String toString() {
        return "ReteaTransport{" +
                "oras='" + oras + '\'' +
                ", numarStatii=" + numarStatii +
                ", costStatie=" + costStatie +
                '}';
    }
}
