package Exercitiul6.Main;

import Exercitiul6.Classes.AMasina;
import Exercitiul6.Classes.Builder;
import Exercitiul6.Classes.IBuilder;
import Exercitiul6.Classes.MasinaPersonalizata;

public class Main {

    public static void main(String [] args){

        IBuilder builder = new Builder("BMW" , " abc");
        MasinaPersonalizata m1 =((Builder) builder).setMesajegeam(true).setMesajePortiere(true).build();
        System.out.println(m1);


    }
}
