package Exercitiul1.classes;

import java.util.List;

public class Spital implements ISpital{

    private String numeSpital;
    private List<IObserver> listaPacienti;


    public Spital(String numeSpital, List<IObserver> listaPacienti) {
        this.numeSpital = numeSpital;
        this.listaPacienti = listaPacienti;
    }

    @Override
    public void adaugaPacient(IObserver pacient) {

        listaPacienti.add(pacient);

    }

    @Override
    public void stergePacient(IObserver pacient) {
        listaPacienti.remove(pacient);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(IObserver pacient:listaPacienti){
             pacient.receptioneazaNotificare(mesaj);
        }

    }

    public void notificareEpidemie(){
        trimiteNotificare("S-a trimis notificarea pentru epidemia !");
    }

    public void notificareVirusi(){
        trimiteNotificare("S-a trimis notificarea pentru virusi!");
    }

}
