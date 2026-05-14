package exercitiul8.main;

import exercitiul8.classes.Abonat;
import exercitiul8.classes.IObserver;
import exercitiul8.classes.IStatieMeteo;
import exercitiul8.classes.StatieMeteo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){


        IObserver observer1= new Abonat("Ionescu ");
        IObserver observer2= new Abonat("Popescu ");
        IObserver observer3= new Abonat("Vulpescu ");
        IObserver observer4= new Abonat("Cristescu ");

        List<IObserver> lista = new ArrayList<>();
        lista.add(observer1);
        lista.add(observer2);
        lista.add(observer3);
        lista.add(observer4);

        IStatieMeteo statie=  new StatieMeteo("Statie 1" , lista);
        statie.notifica("Temperatura >35 grade!");
        System.out.println("-----------------------------------------");
        statie.stergeAbonat(observer1);
        statie.notifica("Temperatura >35 grade!");

    }
}
