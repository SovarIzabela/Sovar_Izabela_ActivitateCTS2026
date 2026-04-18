package Exercitiul1.main;

import Exercitiul1.classes.IObserver;
import Exercitiul1.classes.ISpital;
import Exercitiul1.classes.Pacient;
import Exercitiul1.classes.Spital;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){
        IObserver pacient1 = new Pacient("Pacient1" , 30, 101);
        IObserver pacient2 = new Pacient("Pacient2" , 30, 102);
        IObserver pacient3 = new Pacient("Pacient3" , 30, 103);

        List<IObserver> lista = new ArrayList<>();
        lista.add(pacient1);
        lista.add(pacient2);
        lista.add(pacient3);
        ISpital spital = new Spital("Universitar" , lista);
        spital.adaugaPacient(new Pacient("Pacient4", 45, 104));
        spital.adaugaPacient(new Pacient("Pacient5", 45, 105));
        spital.adaugaPacient(new Pacient("Pacient5", 47, 106));

        ((Spital)spital).notificareEpidemie();
        spital.stergePacient(pacient1);

        System.out.println("------------------------");

        ((Spital)spital).notificareVirusi();
    }

}
