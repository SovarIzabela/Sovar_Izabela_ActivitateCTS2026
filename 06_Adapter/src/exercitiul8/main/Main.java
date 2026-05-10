package exercitiul8.main;

import exercitiul8.classes.*;

public class Main {

    public static void main(String[] args){


        System.out.println("--------------Soft existent------------------------");
        IsoftExistent isoftExistent = new SoftTransportExistent(15000,0.10f);
        System.out.println(isoftExistent.calculeazaCost());
        System.out.println("--------------Soft extern------------------------");
        ISoftExtern softExtern = new SoftExtern(1000,0.21f);
        System.out.println(softExtern.getShippingPrice());
        System.out.println("--------------Soft adaptat------------------------");
        IsoftExistent softAdaptate = new AdapterTransport(softExtern);
        System.out.println(softAdaptate.calculeazaCost());


    }



}
