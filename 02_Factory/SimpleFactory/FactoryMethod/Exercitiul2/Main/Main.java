package FactoryMethod.Exercitiul2.Main;


import FactoryMethod.Exercitiul2.Classes.AClient;
import FactoryMethod.Exercitiul2.Classes.AFactory;
import FactoryMethod.Exercitiul2.Classes.FPersoanaFizica;
import FactoryMethod.Exercitiul2.Classes.FPersoanaJuridica;

public class Main {
    public static void main(String[] args) {

        AFactory f1 = new FPersoanaFizica();
        AFactory f2 = new FPersoanaJuridica();

        AClient c1 = f1.intoarceClient("Popescu");
        AClient c2 = f2.intoarceClient("Ionescu");

        c2.descriereClient();
        c1.descriereClient();

        System.out.println("C1" + c1);
        System.out.println("C2" + c2);

    }



}
