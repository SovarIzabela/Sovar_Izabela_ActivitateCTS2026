package Exercitiu1.Main;

import Exercitiu1.Classes.ContClient;
import Exercitiu1.Classes.IContClient;

public class main {


   public static void main(String[] args) {


       IContClient cont1 = new ContClient("Marin", 10);
       IContClient cont2 = cont1.copiaza();

       System.out.println("--1----" + cont1);
       System.out.println("--2----" + cont2);



    }



}
