package exercitiul8.main;

import exercitiul8.classes.*;

public class Main {

    public static void main(String[] args){


        AEchipaSuport manager = new ManagerSuport();
        AEchipaSuport junior = new TehnicianJunior();
        AEchipaSuport senior = new TehnicianSenior();
        AEchipaSuport specialist = new SpecialistAplicatii();

        junior.setUrmator(senior);
        senior.setUrmator(specialist);
        specialist.setUrmator(manager);

        Tichet tichet1 = new Tichet(100, 5);

        junior.repartizeazaTichete(tichet1);



    }
}
