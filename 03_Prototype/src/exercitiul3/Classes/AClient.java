package exercitiul3.Classes;

public abstract class AClient {

    protected String numeClient;
    protected int idClient;
    protected String emailClient;
    protected String numarTelefon;

    public AClient(String numeClient, int idClient, String emailClient, String numarTelefon) {
        this.numeClient = numeClient;
        this.idClient = idClient;
        this.emailClient = emailClient;
        this.numarTelefon = numarTelefon;
    }

    public AClient() {
    }

    public abstract AClient copy();



}
