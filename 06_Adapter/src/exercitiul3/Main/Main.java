package exercitiul3.Main;

import exercitiul3.Classes.*;

public class Main {

    public static void main(String[] args){



        IFrameworkNou frameworkNou = new FrameworkNou("Sovar Izabela", 50000, 5);
        frameworkNou.acordaLeasing();
        IAplicatiaExistenta adapter = new Adapter(frameworkNou);
        AplicatiaExistenta aplicatiaExistenta = new AplicatiaExistenta(adapter);
        aplicatiaExistenta.proceseazaCredit();


    }
}
