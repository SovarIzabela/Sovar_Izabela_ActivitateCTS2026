package SingletonRegistry.Exercitiul3.Main;

import SingletonRegistry.Exercitiul3.Classes.ManagerRezervare;

public class Main {

    public static void main(String[] args){

        ManagerRezervare managerRezervare1 = ManagerRezervare.getInstance("Ghencea" , 500, "Luni-Duminica", "handbal" );
        ManagerRezervare managerRezervare2 = ManagerRezervare.getInstance("Ghencea" , 700, "Luni-joi", "fotbal" );

        System.out.println("ManagerRezervare1" + managerRezervare1);
        System.out.println("ManagerRezervare2" + managerRezervare2);

        ManagerRezervare managerRezervare3 = ManagerRezervare.getInstance("Stadion Dinamo" , 1500, "Vineri-Duminica", "handbal" );
        ManagerRezervare managerRezervare4 = ManagerRezervare.getInstance("Stadion Dinamo" , 700, "Luni-joi", "fotbal" );

        System.out.println("ManagerRezervare3" + managerRezervare3);
        System.out.println("ManagerRezervare4" + managerRezervare4);

    }


}
