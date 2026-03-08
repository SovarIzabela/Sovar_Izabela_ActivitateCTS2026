package Exercitiul2.Main;

import Exercitiul2.Classes.Cont;
import Exercitiul2.Classes.ContBuilder;
import Exercitiul2.Classes.IBilder;

public class Main {

    public static void main(String[] args) {


        IBilder builder = new ContBuilder();

        Cont cont1 = ((ContBuilder)builder).setNumeClient("Ion").setIban("000012457896").setAreInternetBanking(true).build();

        System.out.println("Cont1->" + cont1);

    }


}
