package exercitiul7.classes;

public class ClientService {

    private String numeClient;
    private String gravitate;

    public ClientService(String numeClient, String gravitate) {
        this.numeClient = numeClient;
        this.gravitate = gravitate;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getGravitate() {
        return gravitate;
    }
}
