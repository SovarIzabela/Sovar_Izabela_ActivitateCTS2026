package exercitiul5.main;

import exercitiul5.classes.AutobuzComposite;
import exercitiul5.classes.AutobuzFrunza;
import exercitiul5.classes.IFlotaAutobuz;

public class Main {

    public static void main(String[] args){

        IFlotaAutobuz nod1= new AutobuzComposite("Flota Autobuze");
        IFlotaAutobuz nod2 = new AutobuzComposite("Grupuri mici - 10 locuri");
        IFlotaAutobuz nod3 = new AutobuzComposite("Grupuri medii - 30 locuri");
        IFlotaAutobuz nod4 = new AutobuzComposite("Grupuri mari - 50 locuri");


        IFlotaAutobuz frunza1 = new AutobuzFrunza("Solaris", " abc123" , 10);
        IFlotaAutobuz frunza2 = new AutobuzFrunza("Mercedes", " abc124" , 10);
        IFlotaAutobuz frunza3 = new AutobuzFrunza("Gmc", " abc124" , 30);
        IFlotaAutobuz frunza4 = new AutobuzFrunza("Solaris", " abc224" , 30);
        IFlotaAutobuz frunza5 = new AutobuzFrunza("Mercedes", " abc424" , 50);
        IFlotaAutobuz frunza6 = new AutobuzFrunza("Man", " abc424" , 30);
        IFlotaAutobuz frunza7 = new AutobuzFrunza("Volvo", " abc5724" , 30);



        nod1.adaugaNod(nod2);
        nod1.adaugaNod(nod3);
        nod1.adaugaNod(nod4);

        nod2.adaugaNod(frunza1);
        nod2.adaugaNod(frunza2);
        //nod2.descriere(" ");
        nod3.adaugaNod(frunza3);
        nod3.adaugaNod(frunza4);
        //nod3.descriere(" ");
        nod4.adaugaNod(frunza5);
        nod4.adaugaNod(frunza6);
        nod4.adaugaNod(frunza7);
       // nod4.descriere(" ");

        nod1.descriere(" ");
    }



}
