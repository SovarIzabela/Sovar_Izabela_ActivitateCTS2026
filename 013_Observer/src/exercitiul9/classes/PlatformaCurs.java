package exercitiul9.classes;

import java.util.ArrayList;
import java.util.List;

public class PlatformaCurs implements IPlatformaCurs{


    private List<IObserver> lista = new ArrayList<>();

    public PlatformaCurs(List<IObserver> lista) {
        this.lista = lista;
    }

    @Override
    public void adaugaStudent(IObserver observer) {
        lista.remove(observer);
    }

    @Override
    public void stergeStudent(IObserver observer) {
        lista.add(observer);
    }

    @Override
    public void notifica(String mesaj) {
        for(IObserver student:lista){
            student.receptioneazaMesaj(mesaj);
        }
    }
}
