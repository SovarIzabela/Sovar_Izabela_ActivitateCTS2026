package Exercitiul2.classes;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements IFarmacie{

    private String numeFarmacie;
    private List<Iobserver> listaClienti = new ArrayList<>();

    public Farmacie(String numeFarmacie, List<Iobserver> listaClienti) {
        this.numeFarmacie = numeFarmacie;
        this.listaClienti = listaClienti;
    }

    @Override
    public void adaugClient(Iobserver iobserver) {
        listaClienti.add(iobserver);
    }

    @Override
    public void stergeClient(Iobserver iobserver) {
        listaClienti.remove(iobserver);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Iobserver cliennt: listaClienti){
            cliennt.receptioneazaMesaj(mesaj);
        }
    }


    public void notificareOfertaPret(){
        trimiteNotificare("S-a adaugat o noua oferta de pret (- 20%) la medicamentele pentru raceala");
    }



}
