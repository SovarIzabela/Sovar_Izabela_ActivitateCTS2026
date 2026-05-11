package exercitiul4.classes;

import java.util.List;

public class Banca implements Ibanca{

    private String numeBanca;
    private List<IObserver> listaClienti;

    public Banca(String numeBanca, List<IObserver> listaClienti) {
        this.numeBanca = numeBanca;
        this.listaClienti = listaClienti;
    }

    @Override
    public void adaugaClient(IObserver observer) {
        listaClienti.add(observer);
    }

    @Override
    public void stergeClient(IObserver observer) {
        listaClienti.remove(observer);
    }

    @Override
    public void notificaClient(String mesaj) {
        for(IObserver client:listaClienti){
            client.receptioneazaMesaj(mesaj);
        }
    }

    public void notificareOfertaDepozit(){
        notificaClient("A aparut o noua oferta pentru depozite!");
    }


}
