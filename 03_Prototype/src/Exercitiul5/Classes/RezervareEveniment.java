package Exercitiul5.Classes;

import java.util.ArrayList;
import java.util.List;

public class RezervareEveniment implements IRezervareEveniment{

    private String numeEvenment;
    private String locatia;
    private int nrLocuri;
    private String tipEveniment;
    private List<String> participanti = new ArrayList<>();


    public RezervareEveniment(String numeEvenment, String locatia, int nrLocuri, String tipEveniment, List<String> participanti) {
        this.numeEvenment = numeEvenment;
        this.locatia = locatia;
        this.nrLocuri = nrLocuri;
        this.tipEveniment = tipEveniment;
        this.participanti = new ArrayList<>(participanti);
    }

    public RezervareEveniment() {

    }

    public List<String> getParticipanti() {
        return participanti;
    }

    @Override
    public IRezervareEveniment copiaza() {

        IRezervareEveniment copy= new RezervareEveniment();
        ((RezervareEveniment) copy).numeEvenment = this.numeEvenment;
        ((RezervareEveniment)copy).locatia=this.locatia;
        ((RezervareEveniment)copy).nrLocuri=this.nrLocuri;
        ((RezervareEveniment)copy).tipEveniment=this.tipEveniment;
        ((RezervareEveniment)copy).participanti= new ArrayList<>(this.participanti);
        return copy;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareEveniment{");
        sb.append("numeEvenment='").append(numeEvenment).append('\'');
        sb.append(", locatia='").append(locatia).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", tipEveniment='").append(tipEveniment).append('\'');
        sb.append(", participanti=").append(participanti);
        sb.append('}');
        return sb.toString();
    }
}
