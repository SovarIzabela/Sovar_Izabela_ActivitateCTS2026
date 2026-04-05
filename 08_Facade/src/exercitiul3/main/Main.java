package exercitiul3.main;

import exercitiul3.classes.Facade;

public class Main {


    public static void main(String[] args){

        Facade facade = new Facade();

        boolean rezultat = facade.deschidereCont("Matei Ion", 39, false, 1500, 10000);

        if(rezultat){
            System.out.println("Se poate deschide cont");
        }else{
            System.out.println("Nu se poate deschide cont, nu sunt indeplinite toare conditiile!");
        }

    }



}
