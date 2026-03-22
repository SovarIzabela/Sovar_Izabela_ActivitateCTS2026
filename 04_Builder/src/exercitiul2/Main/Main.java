package exercitiul2.Main;

import exercitiul2.Classes.Cont;
import exercitiul2.Classes.ContBuilder;
import exercitiul2.Classes.IBilder;

public class Main {

    public static void main(String[] args) {


        IBilder builder = new ContBuilder();

        Cont cont1 = ((ContBuilder)builder).setNumeClient("Ion").setIban("000012457896").setAreInternetBanking(true).build();

        System.out.println("Cont1->" + cont1);

    }


}
