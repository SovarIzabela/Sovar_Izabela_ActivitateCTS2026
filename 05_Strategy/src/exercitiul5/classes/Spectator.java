package exercitiul5.classes;

public class Spectator {

    private String numeSpectator;
    private String numarBilet;
    private IverificareSpectator verificare;

    public Spectator(String numeSpectator, String numarBilet) {
        this.numeSpectator = numeSpectator;
        this.numarBilet = numarBilet;
        this.verificare = new Tribuna();
    }

    public void setVerificareSpectator(IverificareSpectator verificareSpectator) {
        this.verificare = verificareSpectator;
    }

    public void verificareSpectator() {
        verificare.verificareSpectator();
    }



}
