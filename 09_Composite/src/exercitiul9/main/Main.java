package exercitiul9.main;

import exercitiul9.classes.Composite;
import exercitiul9.classes.Frunza;
import exercitiul9.classes.IUniversitate;

public class Main {


    public static void main(String[] args){


        IUniversitate universitate = new Composite("ASE");
        IUniversitate facultate1 = new Composite("Cibernetica");
        IUniversitate facultate2 = new Composite("Contabilitate");
        IUniversitate facultate3 = new Composite("Marketing");
        IUniversitate facultate4 = new Composite("REI");



        IUniversitate departament1 = new Composite("ID");
        IUniversitate departament2 = new Composite("ZI");

        IUniversitate profesor1 = new Frunza("Profesor 1 ");
        IUniversitate profesor2 = new Frunza("Profesor 2 ");
        IUniversitate profesor3 = new Frunza("Profesor 3 ");
        IUniversitate profesor4 = new Frunza("Profesor 4 ");
        IUniversitate profesor5 = new Frunza("Profesor 5 ");


        universitate.adaugaNod(facultate1);
        universitate.adaugaNod(facultate2);
        universitate.adaugaNod(facultate3);
        universitate.adaugaNod(facultate4);


        facultate1.adaugaNod(profesor2);
        facultate1.adaugaNod(profesor1);

        facultate2.adaugaNod(profesor3);
        facultate3.adaugaNod(profesor4);

        facultate4.adaugaNod(profesor5);

        universitate.descriere(" ");


    }


}
