package exercitiul3.Classes;

public class CreditIpotecar implements ICredit{

    private int suma;
    private int perioadaLuni;
    private String client;
    private double rataLunara;
    private double dobanda;

    public CreditIpotecar(int suma, int perioadaLuni, String client, double rataLunara, double dobanda) {
        this.suma = suma;
        this.perioadaLuni = perioadaLuni;
        this.client = client;
        this.rataLunara = rataLunara;
        this.dobanda = dobanda;
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un credit Ipotecar");
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreditIpotecar{");
        sb.append("suma=").append(suma);
        sb.append(", perioadaLuni=").append(perioadaLuni);
        sb.append(", client='").append(client).append('\'');
        sb.append(", rataLunara=").append(rataLunara);
        sb.append(", dobanda=").append(dobanda);
        sb.append('}');
        return sb.toString();
    }
}
