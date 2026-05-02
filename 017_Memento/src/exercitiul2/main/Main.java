package exercitiul2.main;

import exercitiul2.classes.ManagerMemento;
import exercitiul2.classes.Meci;
import exercitiul2.classes.MementoMeci;

public class Main {


    public static void main(String[] args){

        Meci meci1 = new Meci("20.05.2026", "Steaua", 2000, "Dinamo", 3000, 50, 20);
        //Meci meci2 = new Meci("21.04.2026", "Rapid", 2000, "CSM", 1000, 20, 14);
        MementoMeci mementoMeci = meci1.salveazaMemento();
        ManagerMemento managerMemento  =new ManagerMemento();
        managerMemento.adaugaMemento(mementoMeci);

        meci1.setNrBileteVandute(2500);
        managerMemento.adaugaMemento(meci1.salveazaMemento());
        System.out.println(meci1);
        //meci1.setNrBauturiVandute(managerMemento.getLastMemento().getNrBileteVandute());
        MementoMeci memento = managerMemento.getLastMemento();
        meci1.revenire(memento);
        System.out.println("Dupa revenire->" + managerMemento);

    }


}
