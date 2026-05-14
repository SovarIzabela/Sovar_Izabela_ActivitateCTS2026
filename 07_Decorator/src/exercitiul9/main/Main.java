package exercitiul9.main;

import exercitiul9.classes.ABilet;
import exercitiul9.classes.Bilet;
import exercitiul9.classes.BiletDecorat;
import exercitiul9.classes.IBilet;

public class Main {

    public static void main(String[] args){

        IBilet biletStandard = new Bilet(101, "Gladiatorul", true);
        biletStandard.tiparesteBilet(101);
        System.out.println("-------------Bilet Decorat-------------------");
        ABilet biletDecorat = new BiletDecorat(biletStandard);
        biletDecorat.tiparesteBilet(101);

    }


}
