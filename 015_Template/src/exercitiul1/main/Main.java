package exercitiul1.main;

import exercitiul1.classes.InternareUrgenta;
import exercitiul1.classes.InternareNormala;
import exercitiul1.classes.InternarePacient;

public class Main {


    public static void main(String[] args){

        InternarePacient pacient1 = new InternareUrgenta(235, "Pacient1", "racela");
        InternarePacient pacient2 = new InternareNormala(236, "Pacient2", "apendicita");
        System.out.println("-----------------Pacient 1-----------------");
       pacient1.analizeazaStareaPacient();
       pacient1.emitereFisaInternarePacient();
       pacient1.interneazaPacient();
        System.out.println("-----------------Pacient 2-----------------");
       pacient2.analizeazaStareaPacient();
       pacient2.getAfectiune();
       pacient2.interneazaPacient();


    }
}
