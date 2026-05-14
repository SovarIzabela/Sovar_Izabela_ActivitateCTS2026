package exercitiul9.main;

import exercitiul9.classes.*;

public class Main {

    public static void main(String[] args){


        AService  tehnicianJunior = new TehnicianJunior();
        AService tehnicianSenior = new TehnicianSenior();
        AService specialist = new SpecialistHardware();
        AService producator =  new Producator();

        tehnicianJunior.setUrmator(tehnicianSenior);
        tehnicianSenior.setUrmator(specialist);
        specialist.setUrmator(producator);

        Problema p1 = new Problema(100, "grava");
        tehnicianJunior.repartizeazaProbleme(p1);




    }
}
