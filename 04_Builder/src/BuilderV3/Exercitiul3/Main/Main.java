package BuilderV3.Exercitiul3.Main;

import BuilderV3.Exercitiul3.Classes.Pizza;

public class Main {

    public static void main(String[] args){

        Pizza pizza1 = Pizza.builder("moale", 5).setAreMasline(true).build();
        System.out.println(pizza1);

    }
}
