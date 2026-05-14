package exercitiul10.main;

import exercitiul10.classes.*;

public class Main {

    public static void main(String[] args){

        IaplicatieExistenta appExistenta = new AplicatieExistenta("Buleria" , "David Bisbal", "pop");
        appExistenta.redaMelodie();

        IAplicatieExterna playerExtern = new AplicatiaExterna("Billie Jean", "Michael Jackson", 120, "MJ");
        playerExtern.playAudio();
        System.out.println("----------------------------Aplicatie Adaptata------------------");
        IaplicatieExistenta aplicatieAdaptata = new Adapter(playerExtern);
        aplicatieAdaptata.redaMelodie();


    }


}
