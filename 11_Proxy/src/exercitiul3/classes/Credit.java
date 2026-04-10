package exercitiul3.classes;

public class Credit implements Icredit{

    private String numeClient;
    private int suma;
    private String moneda;

    public Credit(String numeClient, int suma, String moneda) {
        this.numeClient = numeClient;
        this.suma = suma;
        this.moneda = moneda;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getSuma() {
        return suma;
    }

    public String getMoneda() {
        return moneda;
    }

    @Override
    public void acordaCredit() {
        System.out.println("S-a acordat credit clientului " + numeClient);
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Credit{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", suma=").append(suma);
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
