package exercitiul1.main;

import exercitiul1.classes.*;

public class Main {

    public static void main(String[] args) {
        Cont cont1 = new Cont("Sovar Izabela" , "ING" , 20000.0F);
        Cont cont = new Cont("Sovar Izabela" , "ING" , 20.0F);
        Acont contCurent = new ContCurent();
        Acont cont2 = new Cont2();
        Acont cont3 = new Cont3();

        contCurent.setCont(cont2);
        cont2.setCont(cont3);

        contCurent.plateste(cont1, 100);
        contCurent.plateste(cont,500.0f);


    }
}
