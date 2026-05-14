package exercitiul10.main;

import exercitiul10.classes.FlyweightMasina;
import exercitiul10.classes.Masina;
import exercitiul10.classes.Optionale;

public class Main {

    public static void main(String[] args){


        Optionale op1 = new Optionale(12,14,1,20);
        Optionale op2 = new Optionale(10,12,5,2);
        Optionale op3 = new Optionale(17,15,4,17);

        FlyweightMasina flyweightMasina = new FlyweightMasina();

        Masina masina = flyweightMasina.getMasina("m1" , "verde", 1);
        masina.descriere(op1);
        masina.descriere(op2);
        masina.descriere(op3);

        System.out.println("------------------------------------------");

        Masina masina2 = flyweightMasina.getMasina("m2" , "rosu", 2);
        masina2.descriere(op1);
        masina2.descriere(op2);
        masina2.descriere(op3);


    }


}
