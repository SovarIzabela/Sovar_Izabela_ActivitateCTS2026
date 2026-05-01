package exercitiul3.classes;

public class ClientRestaurant {

    private static int contor=0;
    private String numeClient;
    private int idClient;
    private String nrTelefon;
    private boolean areRezervare;
    private boolean esteClientFidel;
    private int masaPreferata;
    private IModPlata modPlata;

    public ClientRestaurant(String numeClient, String nrTelefon, boolean areRezervare, boolean esteClientFidel, IModPlata modPlata, int masaPreferata) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        this.areRezervare = areRezervare;
        this.esteClientFidel = esteClientFidel;
        this.modPlata = modPlata;
        this.masaPreferata = masaPreferata;
        this.idClient = contor++;
    }

    public ClientRestaurant(String numeClient, String nrTelefon, boolean areRezervare, boolean esteClientFidel, int masaPreferata) {
        this.numeClient = numeClient;
        this.idClient = contor++;
        this.nrTelefon = nrTelefon;
        this.areRezervare = areRezervare;
        this.esteClientFidel = esteClientFidel;
        this.masaPreferata = masaPreferata;
        this.modPlata = new PlataCard();
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }


    public void plateste(float sumaPlatita){
        modPlata.plateste(this.numeClient, sumaPlatita);
    }


    @Override
    public String toString() {
        return "ClientRestaurant{" +
                "numeClient='" + numeClient + '\'' +
                ", idClient=" + idClient +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", areRezervare=" + areRezervare +
                ", esteClientFidel=" + esteClientFidel +
                ", masaPreferata=" + masaPreferata +
                ", modPlata=" + modPlata +
                '}';
    }
}
