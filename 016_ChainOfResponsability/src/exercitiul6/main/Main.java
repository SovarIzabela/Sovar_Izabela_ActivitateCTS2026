package exercitiul6.main;

import exercitiul6.classes.*;

public class Main {

    public static void main(String[] args){

        Pacient pacient1 = new Pacient("Pacient1", 1);
        Pacient pacient2 = new Pacient("Pacient2", 5);
        Pacient pacient3 = new Pacient("Pacient3", 8);
        Pacient pacient4 = new Pacient("Pacient4", 10);

        Aspital cabinet = new Cabinet();
        Aspital cameraGarda = new CameraGarda();
        Aspital terapieIntensiva = new TerapieIntensiva();

        Aspital salaOperatie = new SalaOperatie();

        cabinet.setUrmator(cameraGarda);
        cameraGarda.setUrmator(terapieIntensiva);
        terapieIntensiva.setUrmator(salaOperatie);

        cabinet.repartizarePacient(pacient1);
        cabinet.repartizarePacient(pacient2);
        cabinet.repartizarePacient(pacient3);
        cabinet.repartizarePacient(pacient4);






    }



}
