package SingletonRegistry.Exercitiul2.Main;

import SingletonRegistry.Exercitiul2.Classes.BancaManager;

public class Main {


    public static void main(String[] args) {

        BancaManager banca1 = BancaManager.getInstance("Bucuresti", 100, 5000.0f);
        BancaManager banca2 = BancaManager.getInstance("Bucuresti", 120, 4500000.0f);
        System.out.println("Banca 1 " + banca1);
        System.out.println("Banca 2 " + banca2);

        BancaManager banca3 = BancaManager.getInstance("Pitesti", 15, 455000.0f);
        BancaManager banca4 = BancaManager.getInstance("Pitesti", 155, 355000.0f);

        System.out.println("Banca 3 " + banca3);
        System.out.println("Banca 4 " + banca4);

    }
}
