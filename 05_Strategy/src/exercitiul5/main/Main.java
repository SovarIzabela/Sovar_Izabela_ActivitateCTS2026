package exercitiul5.main;

import exercitiul5.classes.Spectator;
import exercitiul5.classes.TribunaVIP;

public class Main {

    public static void main(String[] args){

        Spectator spectator1 = new Spectator("Spectator1", "abc124");
        spectator1.verificareSpectator();
        spectator1.setVerificareSpectator(new TribunaVIP());
        spectator1.verificareSpectator();




    }




}
