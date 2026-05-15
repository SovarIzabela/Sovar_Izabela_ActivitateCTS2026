package exercitiul11.main;

import exercitiul11.classes.*;

public class Main {

    public static void main(String[] args){


        AbstractLectiePlatforma abs = new LectiePlatforma("titlu Lectie Platforma 1 ", " Continut Intern 1");
        String continut =   abs.obtineContinutStandardizat();
        String titlu =  abs.obtineTitlu();
        System.out.println(continut +" " + titlu);




        IcontinutExtern icontinutExtern = new ContinutExtern("Titlu continut Extern" , "text continut extern");

        AbstractLectiePlatforma abs2 = new Adapter(icontinutExtern);
       String continut1 =  abs2.obtineTitlu();
      String titlu2=   abs2.obtineContinutStandardizat();

        System.out.println(continut1 +" " + titlu2);
    }



}
