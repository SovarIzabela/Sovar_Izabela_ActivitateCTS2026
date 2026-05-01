package exercitiul3.classes;

public class ClientRestaurant implements Iobserver{
    private static int contor=0;
    private String numeClient;
    private int idClient;
    private String nrTelefon;
    private boolean areRezervare;
    private int masaPreferata;
    private int varsta;

    public ClientRestaurant(String numeClient, String nrTelefon, boolean areRezervare, int masaPreferata, int varsta) {
        this.numeClient = numeClient;
        this.idClient = contor++;
        this.nrTelefon = nrTelefon;
        this.areRezervare = areRezervare;
        this.masaPreferata = masaPreferata;
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaNotificare(String notificare) {
        System.out.println(numeClient + " a receptionat notificarea!");
    }


    @Override
    public String toString() {
        return "ClientRestaurant{" +
                "numeClient='" + numeClient + '\'' +
                ", idClient=" + idClient +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", areRezervare=" + areRezervare +
                ", masaPreferata=" + masaPreferata +
                ", varsta=" + varsta +
                '}';
    }
}
