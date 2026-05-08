package Exercitiul5.main;

import Exercitiul5.classes.FlyweightPacient;
import Exercitiul5.classes.Optionale;
import Exercitiul5.classes.Pacient;

public class Main {

    public static void main(String[] args){
        Optionale optionale1 = new Optionale(101, 10, 5);
        Optionale optionale2 = new Optionale(101, 12, 5);
        Optionale optionale3 = new Optionale(105, 18, 5);
        Optionale optionale4 = new Optionale(107, 14, 5);

        FlyweightPacient flyweightPacient = new FlyweightPacient();
        Pacient pacient = flyweightPacient.getPacient("Iza", "075600000", "Bucuresti", 39);
        Pacient pacient3 = flyweightPacient.getPacient("Iza", "0745789645", "Iasi", 39);

        pacient.descriere(optionale1);
        pacient.descriere(optionale2);
        pacient.descriere(optionale3);
        pacient.descriere(optionale4);
        System.out.println("-------------------avem aceasi cheie--------------");
        pacient3.descriere(optionale1);
        pacient3.descriere(optionale2);
        pacient3.descriere(optionale3);
        pacient3.descriere(optionale4);


        System.out.println("-----------schimbam cheia----------------");
        FlyweightPacient flyweightPacient2 = new FlyweightPacient();
        Pacient pacient2 = flyweightPacient.getPacient("Maria", "000000000", "Bucuresti", 39);
        pacient2.descriere(optionale1);
        pacient2.descriere(optionale2);
        pacient2.descriere(optionale3);
        pacient2.descriere(optionale4);




    }



}
