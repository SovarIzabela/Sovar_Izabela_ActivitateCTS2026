package Exercitiul9.Classes;

import java.util.ArrayList;
import java.util.List;

public class ClientRezervare implements IClientRezervare{

    private String nume;
    private int nrPersoane;
    private int oraRezervare;
    private List<String> listaPreferinte;

    public ClientRezervare(String nume, int nrPersoane, int oraRezervare, List<String> listaPreferinte) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
        this.listaPreferinte = new ArrayList<>(listaPreferinte);
    }

    public ClientRezervare() {

    }

    @Override
    public IClientRezervare copiaza() {
        ClientRezervare clona = new ClientRezervare();
        clona.nume=this.nume;
        clona.nrPersoane = this.nrPersoane;
        clona.oraRezervare= this.oraRezervare;
        clona.listaPreferinte = new ArrayList<>(this.listaPreferinte);
        return clona;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientRezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", listaPreferinte=").append(listaPreferinte);
        sb.append('}');
        return sb.toString();
    }
}
