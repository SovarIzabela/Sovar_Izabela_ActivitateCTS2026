package Exercitiul2.classes;

public class ClientFarmacie implements Iobserver{
    private String numeClient;
    private int idPacient;
    private boolean areRetetaCompensata;

    public ClientFarmacie(String numeClient, int idPacient, boolean areRetetaCompensata) {
        this.numeClient = numeClient;
        this.idPacient = idPacient;
        this.areRetetaCompensata = areRetetaCompensata;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Clientul " + numeClient + " a primit mesajul"+ mesaj);
    }
}
