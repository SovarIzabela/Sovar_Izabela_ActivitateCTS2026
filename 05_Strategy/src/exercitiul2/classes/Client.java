package exercitiul2.classes;

public class Client {

    private String numeClient;
    private int idClient;
    private boolean areReteta;
    private IPlata modplata;

    public Client(String numeClient, int idClient, boolean areReteta, IPlata modplata) {
        this.numeClient = numeClient;
        this.idClient = idClient;
        this.areReteta = areReteta;
        this.modplata = modplata;
    }


    public Client(String numeClient, int idClient, boolean areReteta) {
        this.numeClient = numeClient;
        this.idClient = idClient;
        this.areReteta = areReteta;
        this.modplata = new PlataCash();
    }

    public void setModplata(IPlata modplata) {
        this.modplata = modplata;
    }

    public void plateste(double suma){
        modplata.plateste(this.numeClient, suma);
    }


}
