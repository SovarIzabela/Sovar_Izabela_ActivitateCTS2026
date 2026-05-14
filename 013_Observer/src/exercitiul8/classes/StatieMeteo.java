package exercitiul8.classes;

import java.util.ArrayList;
import java.util.List;

public class StatieMeteo implements IStatieMeteo{

    private String numeStatie;
    private List<IObserver> lista = new ArrayList<>();

    public StatieMeteo(String numeStatie, List<IObserver> lista) {
        this.numeStatie = numeStatie;
        this.lista = lista;
    }

    @Override
    public void adaugaAbonat(IObserver observer) {
        lista.add(observer);
    }

    @Override
    public void stergeAbonat(IObserver observer) {
        lista.remove(observer);
    }

    @Override
    public void notifica(String mesaj) {
        for(IObserver observer:lista){
            observer.receptioneazaMesaj(mesaj);
        }
    }
}
