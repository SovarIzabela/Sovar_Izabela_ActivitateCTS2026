package Exercitiul6.Main;

import Exercitiul6.Classes.ConfiguratieAutobuz;
import Exercitiul6.Classes.IConfiguratieAutobuz;

public class Main {

    public static void main(String[] args){

        IConfiguratieAutobuz configuratieAutobuz = new ConfiguratieAutobuz("S101", 2020, 75, "Benzina", true);

        IConfiguratieAutobuz configuratieAutobuz1 = configuratieAutobuz.copiaza();

        System.out.println(configuratieAutobuz);
        System.out.println(configuratieAutobuz1);

        ((ConfiguratieAutobuz) configuratieAutobuz1).setModelAutobuz("C200");

        System.out.println(configuratieAutobuz);
        System.out.println(configuratieAutobuz1);

    }
}
