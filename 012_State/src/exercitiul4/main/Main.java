package exercitiul4.main;

import exercitiul4.classes.IStare;
import exercitiul4.classes.Liber;
import exercitiul4.classes.OcupareLoc;
import exercitiul4.classes.Rezervat;

public class Main {

    public static void main(String[] args){
        OcupareLoc loc =new OcupareLoc(101);
        loc.getStare().rezerva(loc);


        System.out.println(loc.getStare());

    }
}
