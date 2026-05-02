package exercitiul2.classes;

public class ClientFidel {
    private static int contor;
    private String numeClient;
    private int idClient;
    private String numarTelefon;
    private String email;

    public ClientFidel(String numeClient, String numarTelefon, String email) {
        this.numeClient = numeClient;
        this.numarTelefon = numarTelefon;
        this.email = email;
        this.idClient = contor++;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getIdClient() {
        return idClient;
    }
}
