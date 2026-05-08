package exercitiul6.main;

import exercitiul6.classes.IVirus;
import exercitiul6.classes.VirusCategorie;
import exercitiul6.classes.VirusFrunza;

public class Main {

    public static void main(String [] args){


        IVirus continent1 = new VirusCategorie("Europa");
        IVirus continent2 = new VirusCategorie("Asia");
        IVirus continent3 = new VirusCategorie("Africa");

        IVirus  tara1 = new VirusCategorie("Romania");
        IVirus  tara2 = new VirusCategorie("Maroc");
        IVirus  tara6 = new VirusCategorie("Egipt");
        IVirus  tara3 = new VirusCategorie("India");
        IVirus  tara4 = new VirusCategorie("Franta");
        IVirus  tara5 = new VirusCategorie("Thailanda");

        IVirus virus = new VirusFrunza("covid", 1);
        IVirus virus1 = new VirusFrunza("virus1", 2);
        IVirus virus2 = new VirusFrunza("virus2", 3);
        IVirus virus3 = new VirusFrunza("virus3", 1);

        continent1.adaugaNod(tara1);
        tara1.adaugaNod(virus);
        continent1.adaugaNod(tara4);
        tara4.adaugaNod(virus1);
        continent3.adaugaNod(tara3);
        continent3.adaugaNod(tara5);
        tara5.adaugaNod(virus2);
        continent2.adaugaNod(tara2);
        tara2.adaugaNod(virus3);
        continent2.adaugaNod(tara6);
        tara6.adaugaNod(virus2);
        tara3.adaugaNod(virus2);

        continent1.descriere(" ");
        continent2.descriere(" ");
        continent3.descriere(" ");




    }


}
