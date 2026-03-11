package SingletonRegistry.Exercitiul5.Main;

import SingletonRegistry.Exercitiul5.Classes.ManagerSucursala;

public class Main {


    public static void main(String[] args){

        ManagerSucursala managerSucursala = ManagerSucursala.getInstance("Popescu", 15, 250000f);
        ManagerSucursala managerSucursala2 = ManagerSucursala.getInstance("Popescu", 105, 1250000f);
        ManagerSucursala managerSucursala3 = ManagerSucursala.getInstance("Ionescu",  215, 2250000f);

        System.out.println(managerSucursala);
        System.out.println(managerSucursala2);
        System.out.println(managerSucursala3);
    }


}
