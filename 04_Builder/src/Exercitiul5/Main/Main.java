package Exercitiul5.Main;

import Exercitiul5.Classes.Builder;
import Exercitiul5.Classes.Calculator;
import Exercitiul5.Classes.IBuilder;

public class Main {

    public static void main(String[] args){
        IBuilder builder = new Builder();

        Calculator calculator1 = ((Builder)builder).setProcesor("AMD RYZEN7").setRam(32).build();

        System.out.println(calculator1);
        Calculator calculator2 = ((Builder)builder).setPlacaVideo(true).build();
        System.out.println(calculator2);

    }

}
