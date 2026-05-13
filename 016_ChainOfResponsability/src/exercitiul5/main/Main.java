package exercitiul5.main;

import exercitiul5.classes.*;

public class Main {

    public static void main(String[] args){

        Client c1 = new Client("Client1", 4000) ;
        Client c2 = new Client("Client2", 5000) ;
        Client c3 = new Client("Client3", 100000) ;
        Client c4 = new Client("Client4", 210000) ;

        ABanca operatoeBancar = new OperatorBancar();
        ABanca directorRegional = new DirectorRegional();
        ABanca managerSucursala = new ManagerSucursala();
        ABanca sediuCentral = new SediuCentral();

        operatoeBancar.setUrmator(managerSucursala);
        managerSucursala.setUrmator(directorRegional);
        directorRegional.setUrmator(sediuCentral);

        operatoeBancar.aprobareCredit(c1);
        operatoeBancar.aprobareCredit(c2);
        operatoeBancar.aprobareCredit(c3);
        operatoeBancar.aprobareCredit(c4);


    }


}
