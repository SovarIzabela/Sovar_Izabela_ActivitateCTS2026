package exercitiul1.classes;

public class Rezervare implements Irezervare{

    private String numeClient;
    private int numarPersoane;

    public Rezervare(String numeClient, int numarPersoane) {
        this.numeClient = numeClient;
        this.numarPersoane = numarPersoane;
    }


    public String getNumeClient() {
        return numeClient;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", numarPersoane=").append(numarPersoane);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void creazaRezervare() {
        System.out.println("S-a efectuat rezervarea!" + numeClient);
    }
}
