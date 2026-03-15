package SingletonRegistry.Exercitiul6.Main;

import SingletonRegistry.Exercitiul6.Classes.ManagerService;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){
        List<String> lista1 = new ArrayList<>();
        lista1.add("dacia");
        lista1.add("opel");

        ManagerService managerService1 = ManagerService.getInstance("Bucuresti", 100, lista1);
        ManagerService managerService2 = ManagerService.getInstance("Bucuresti", 150, lista1);
        ManagerService managerService3 = ManagerService.getInstance("Pitesti", 150, lista1);

        System.out.println(managerService1);
        System.out.println(managerService2);
        System.out.println(managerService3);

    }
}
