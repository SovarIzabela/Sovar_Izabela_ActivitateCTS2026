package exercitiul9.main;

import exercitiul9.classes.*;

public class Main {

    public static void main(String[] args){


        IsoftExistent existent = new SoftExistent("Client1", 200);
        existent.platesteOnline();

        ISoftExtern extern = new SoftExtern(127, 450);
        extern.efectueazaPlata();

        System.out.println("------------Soft adaptat-------------------");
        IsoftExistent softAdaptat = new Adapter(extern);

        softAdaptat.platesteOnline();



    }


}
