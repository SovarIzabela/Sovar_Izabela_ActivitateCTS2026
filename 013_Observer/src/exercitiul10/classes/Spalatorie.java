package exercitiul10.classes;

import java.util.ArrayList;
import java.util.List;

public class Spalatorie implements ISpalatorie{


    private List<IObserverClient> lista = new ArrayList<>();

    public Spalatorie(List<IObserverClient> lista) {
        this.lista = lista;
    }

    @Override
    public void adaugaClient(IObserverClient client) {
        lista.add(client);
    }

    @Override
    public void stergeClient(IObserverClient client) {
        lista.remove(client);
    }

    @Override
    public void notificaClient(String mesaj) {
        for(IObserverClient client:lista){
            client.receptioneazaMesaj(mesaj);
        }
    }
}
