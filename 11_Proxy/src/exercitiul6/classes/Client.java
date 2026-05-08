package exercitiul6.classes;

public class Client {

    private String numeClient;
    private int varsta;


    public Client(String numeClient, int varsta) {
        this.numeClient = numeClient;
        this.varsta = varsta;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getVarsta() {
        return varsta;
    }
}
