package SingletonRegistry.Exercitiul4.Main;

import SingletonRegistry.Exercitiul4.Classes.ValidatorStatie;

public class Main {

    public static void main(String [] args){

        ValidatorStatie validatorStatie1 = ValidatorStatie.getInstance("Afi", "Autobuz", true);
        ValidatorStatie validatorStatie2 = ValidatorStatie.getInstance("Afi", "Troleibuz", true);
        ValidatorStatie validatorStatie3 = ValidatorStatie.getInstance("Unirii", "Tramvai", false);
        System.out.println(validatorStatie1);
        System.out.println(validatorStatie2);
        System.out.println(validatorStatie3);

    }

}
