package exercitiul2.main;

import exercitiul2.classes.Proxy;
import exercitiul2.classes.VanzareMedicament;

public class Main {
    public static void main(String [] args){

        VanzareMedicament vanzareMedicament = new VanzareMedicament("Iza", 101, true);
        Proxy proxy=new Proxy(vanzareMedicament);
        proxy.vindeMedicament();


        VanzareMedicament vanzareMedicament2 = new VanzareMedicament("Ada", 102, false);
        Proxy proxy2=new Proxy(vanzareMedicament2);
        proxy2.vindeMedicament();





    }
}
