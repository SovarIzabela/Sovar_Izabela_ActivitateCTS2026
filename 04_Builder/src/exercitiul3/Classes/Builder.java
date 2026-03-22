package exercitiul3.Classes;

public class Builder implements BuilderRezervare {

    private Rezervare rezervare;

    public Builder() {
        this.rezervare = new Rezervare("Necunoscut", false, false, false, false, "Necunoscuta");
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }

    public Builder setNumeClient(String numeClient) {
        this.rezervare.setNumeClient(numeClient);
        return this;
    }

    public Builder setAreMancareInclusa(boolean areMancareInclusa) {
        this.rezervare.setAreMancareInclusa(areMancareInclusa);
        return this;
    }

    public Builder setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public Builder setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.rezervare.setAreBauturaRacoritoareInclusa(areBauturaRacoritoareInclusa);
        return this;
    }

    public Builder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }

    public Builder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }





}
