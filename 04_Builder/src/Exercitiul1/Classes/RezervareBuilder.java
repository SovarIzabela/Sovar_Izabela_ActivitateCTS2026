package Exercitiul1.Classes;

public class RezervareBuilder implements IBuilder {


    private Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare(false, false, false, false, null);
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }


    public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
        this.rezervare.setAsezareGeam(asezareGeam);
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }
    public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
        this.rezervare.setDecorareMasa(decorareMasa);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }





}
