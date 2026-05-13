package exercitiul9.main;

import exercitiul9.classes.FlyweightSoldat;
import exercitiul9.classes.ISoldat;
import exercitiul9.classes.Optionale;
import exercitiul9.classes.Soldat;

public class Main {

    public static void main(String[] args){

        Optionale optionale1 = new Optionale(12,4,5, "sud");
        Optionale optionale2 = new Optionale(10,14,1, "nord");
        Optionale optionale3 = new Optionale(3,40,3, "vest");

        FlyweightSoldat flyweightSoldat = new FlyweightSoldat();
        ISoldat soldat = flyweightSoldat.getSoldat(1, "metalica", " model1", "argintiu");
        soldat.afiseazaSoldat(optionale1);
        soldat.afiseazaSoldat(optionale2);
        soldat.afiseazaSoldat(optionale3);

        System.out.println("------------------------------------------------------");
        ISoldat soldat2 = flyweightSoldat.getSoldat(1, "textila", " model1", "argintiu");
        soldat2.afiseazaSoldat(optionale1);
        soldat2.afiseazaSoldat(optionale2);
        soldat2.afiseazaSoldat(optionale3);
        System.out.println("---------------------------------------------");
        ISoldat soldat3 = flyweightSoldat.getSoldat(2, "metalica", " model1", "argintiu");
        soldat3.afiseazaSoldat(optionale1);
        soldat3.afiseazaSoldat(optionale2);
        soldat3.afiseazaSoldat(optionale3);


    }



}
