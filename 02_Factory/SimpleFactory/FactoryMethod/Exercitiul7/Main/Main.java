package FactoryMethod.Exercitiul7.Main;

import FactoryMethod.Exercitiul7.Classes.*;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args){

        Ifactory f1 = new FTuningOffRoad();
        Ifactory f2 = new FTunningSport();

        AMasina tunningOffRoad1=  f1.creazaMasina("Dacia", "123", new ArrayList<>());
        AMasina tunningSport=  f2.creazaMasina("OPEL", "123", new ArrayList<>());


        System.out.println(tunningOffRoad1);
        System.out.println(tunningSport);

    }
}
