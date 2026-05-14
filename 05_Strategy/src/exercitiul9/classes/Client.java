package exercitiul9.classes;

public class Client {

    private String idClient;
    private IModPlata modPlata;


    public Client(String idClient) {
        this.idClient = idClient;
        this.modPlata = new Card();
    }

    public Client(String idClient, IModPlata modPlata) {
        this.idClient = idClient;
        this.modPlata = modPlata;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public IModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(float valoare) {
        modPlata.plateste(valoare);
    }



}
