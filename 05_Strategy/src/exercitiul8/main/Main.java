package exercitiul8.main;

import exercitiul8.classes.*;

public class Main {
    public static void main(String[] args){

        IPretTransport pret1 = new PretNoapte();
        IPretTransport pret2 = new PretWeekend();
        IPretTransport pret3 = new PretStandard();

        Utiizator utiizator1 = new Utiizator("Utilizator 1 ");
        utiizator1.calculPretTransport();
        utiizator1.setPret(pret2);
        utiizator1.calculPretTransport();



    }
}
