package exercitiul4.classes;

public class ClientAbonat implements IObserver {

    private String numeClient;
    private int idClient;
    private String adresaEmail;

    public ClientAbonat(String numeClient, int idClient, String adresaEmail) {
        this.numeClient = numeClient;
        this.idClient = idClient;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("S-a receptionat mesajul:"+mesaj+" de catre clientul : " + numeClient);
    }
}
