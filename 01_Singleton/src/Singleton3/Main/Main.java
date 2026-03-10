package Singleton3.Main;

import Singleton3.Classes.ManagerAbonamentLunarStb;

public class Main {

    public static void main(String[] args){

        ManagerAbonamentLunarStb managerAbonamentLunarStb = ManagerAbonamentLunarStb.getInstance(80,"Bucuresti", 30);
        System.out.println(managerAbonamentLunarStb);

        ManagerAbonamentLunarStb managerAbonamentLunarStb2 = ManagerAbonamentLunarStb.getInstance(70, "Bucuresti", 31);
        System.out.println(managerAbonamentLunarStb2);

        System.out.println(managerAbonamentLunarStb2==managerAbonamentLunarStb);



    }


}
