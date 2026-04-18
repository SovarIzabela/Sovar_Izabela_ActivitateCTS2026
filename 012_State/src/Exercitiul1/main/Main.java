package Exercitiul1.main;

import Exercitiul1.classes.*;

public class Main {

    public static void main(String[] args){
        Pacient pacient1 = new Pacient("Pacient1", 101);
        Istare stareInternat = new Internat();
        stareInternat.doAction(pacient1);
        System.out.println(pacient1.getStare());

        Istare stareExternat = new Externat();
        Istare stareSubObservatie = new SubObservatie();
    }
}
