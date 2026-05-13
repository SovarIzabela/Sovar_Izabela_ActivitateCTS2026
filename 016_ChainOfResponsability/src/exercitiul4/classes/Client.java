package exercitiul4.classes;

public class Client {

    private String numeClient;
    private int nrPersoane;


    public Client(String numeClient, int nrPersoane) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
