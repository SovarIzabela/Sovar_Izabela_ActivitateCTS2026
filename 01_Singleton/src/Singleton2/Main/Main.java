package Singleton2.Main;

import Singleton2.Classes.ManagerBilet;

public class Main {

    public static void main(String[] args){


        ManagerBilet managerBilet = ManagerBilet.getInstance();
        System.out.println("ManagerBilet1"+ managerBilet);
        ManagerBilet managerBilet2 = ManagerBilet.getInstance();
        System.out.println("ManagerBilet2"+ managerBilet2);

        managerBilet.setNrMaximLocuri(700);
        System.out.println(managerBilet.getNrMaximLocuri());

        System.out.println("ManagerBilet2"+ managerBilet2);


    }


}
