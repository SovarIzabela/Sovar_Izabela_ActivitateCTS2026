package exercitiul7.classes;

import java.util.ArrayList;
import java.util.List;

public class MagazinOnline implements IMagazinOnline{

    private String numeMagazin;
    private List<Iobserver> listaAbonati = new ArrayList<>();

    public MagazinOnline(String numeMagazin, List<Iobserver> listaAbonati) {
        this.numeMagazin = numeMagazin;
        this.listaAbonati = listaAbonati;
    }

    @Override
    public void adaugaClient(Iobserver iobserver) {
        listaAbonati.add(iobserver);
    }

    @Override
    public void dezabonareClient(Iobserver iobserver) {
        listaAbonati.remove(iobserver);
    }

    @Override
    public void notificaClient(String mesaj) {
        for(Iobserver client: listaAbonati){
            client.receptioneazaMesaj(mesaj);
        }
    }
}
