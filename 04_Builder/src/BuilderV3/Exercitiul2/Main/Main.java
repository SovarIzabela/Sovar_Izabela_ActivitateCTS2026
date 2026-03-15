package BuilderV3.Exercitiul2.Main;

import BuilderV3.Exercitiul2.Classes.Masina;

public class Main {

    public static void main(String[] args){


        Masina masina1 = Masina.builder().setMarca("bmv").build();
        System.out.println(masina1);

    }


}
