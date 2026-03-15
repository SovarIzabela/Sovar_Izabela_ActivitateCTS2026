package Exercitiul7.Main;


import Exercitiul7.Classes.Build;
import Exercitiul7.Classes.Pizza;

public class Main {

    public static void main(String[] args){

        Build builder = new Build("mediu", 20);
        Pizza p1= builder.setExtraBranza(true).build();

        System.out.println(p1);


    }
}
