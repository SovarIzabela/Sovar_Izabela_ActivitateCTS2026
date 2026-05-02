package exercitiul3.main;

import exercitiul3.classes.*;

public class Main {

    public static void main(String[] args){

        Masa masa1 = new Masa(101, 4, "TavernaRacilor");
        State stareLibera = new Libera();
        stareLibera.doAction(masa1);

        State stareOcupata = new Ocupata();
        stareOcupata.doAction(masa1);

        State stareRezervata = new Rezervata();
        stareRezervata.doAction(masa1);

    }
}
