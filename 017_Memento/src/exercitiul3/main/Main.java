package exercitiul3.main;

import exercitiul3.classes.ManagerMemento;
import exercitiul3.classes.MementoPachet;
import exercitiul3.classes.PachetTuristic;

public class Main {


    public static void main(String[] args){

        PachetTuristic pachetTuristic = new PachetTuristic(1, "Roma", 300);
        MementoPachet pachet1 =  pachetTuristic.salveazaMemento();
        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.adauga(pachet1);
        pachet1.setPret(350);
        managerMemento.adauga(pachetTuristic.salveazaMemento());

        System.out.println(managerMemento);


    }



}
