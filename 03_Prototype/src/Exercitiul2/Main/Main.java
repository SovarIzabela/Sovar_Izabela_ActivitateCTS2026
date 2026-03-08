package Exercitiul2.Main;

import Exercitiul2.Classes.Client;
import Exercitiul2.Classes.IClient;

public class Main {

    public static void main(String[] args) {

        IClient c1 = new Client("Popescu Ion" , "000001256489");
        IClient c2 = c1.copiaza();
        System.out.println("Clientul C1" + c1);
        System.out.println("Clientul C2" + c2);


    }
}
