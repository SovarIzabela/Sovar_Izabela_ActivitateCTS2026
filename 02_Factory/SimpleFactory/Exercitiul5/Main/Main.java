package Exercitiul5.Main;

import Exercitiul5.Classes.Factory;
import Exercitiul5.Classes.IMijlocTransport;
import Exercitiul5.Classes.TipTransport;

public class Main {


    public static void main(String[] args) throws Exception {


        Factory factory = new Factory();

        IMijlocTransport transport1 = factory.creeazaMijlocTransport(TipTransport.autobuz,"Mecerdez", "C235", "2020",500, false );
        IMijlocTransport transport2 = factory.creeazaMijlocTransport(TipTransport.tramvai,"Astra", "A235", "2024",500, true );
        IMijlocTransport transport3 = factory.creeazaMijlocTransport(TipTransport.troleibuz,"Solaris", "S235", "2002",100, true );

        System.out.println(transport1);
        System.out.println(transport2);
        System.out.println(transport3);

        transport1.descriere();
        transport2.descriere();
        transport3.descriere();

    }
}
