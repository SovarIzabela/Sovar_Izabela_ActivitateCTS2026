package Exercitiul1.main;

import Exercitiul1.classes.Cont;
import Exercitiul1.classes.ManagerMementoCont;
import Exercitiul1.classes.MementoCont;

public class Main {

    public static void main(String[] args){
        Cont cont = new Cont("Sovar Izabela", 2000.0f);

        ManagerMementoCont managerMementoCont = new ManagerMementoCont();

        managerMementoCont.adauga(cont.salveazaMemento());
        cont.setValoare(15000);
        managerMementoCont.adauga(cont.salveazaMemento());
        cont.setValoare(2500);


        System.out.println("Inainte " + cont);
        try {
            System.out.println("Ultimul memento");
            MementoCont ultimaValoare = managerMementoCont.getLastMemento();
            System.out.println("Ultima valoare din lista " + ultimaValoare);
            cont.undo(ultimaValoare);
            System.out.println(" ----- Undo---------" + cont);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
