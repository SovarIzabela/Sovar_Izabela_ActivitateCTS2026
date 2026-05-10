package exercitiul8.main;

import exercitiul8.classes.ElementeOptionale;
import exercitiul8.classes.Eveniment;
import exercitiul8.classes.FlyweightEveniment;

public class Main {

    public static void main(String[] args){

        ElementeOptionale optionale1 = new ElementeOptionale(10,15);
        ElementeOptionale optionale2 = new ElementeOptionale(12,150);
        ElementeOptionale optionale3 = new ElementeOptionale(14,12);
        ElementeOptionale optionale4 = new ElementeOptionale(1,10);

        FlyweightEveniment flyweightEveniment = new FlyweightEveniment();
        Eveniment eveniment = flyweightEveniment.getEveniment("Smiley" , " Arene" , "01.06.2026");
        eveniment.descriere(optionale1);
        eveniment.descriere(optionale2);
        eveniment.descriere(optionale3);
        eveniment.descriere(optionale4);

        Eveniment eveniment2 = flyweightEveniment.getEveniment("Smiley" , " Romexpo" , "01.06.2026");
        eveniment2.descriere(optionale1);
        eveniment2.descriere(optionale2);
        eveniment2.descriere(optionale3);
        eveniment2.descriere(optionale4);


        Eveniment eveniment3 = flyweightEveniment.getEveniment("Delia" , " Arene" , "01.06.2026");
        eveniment3.descriere(optionale1);
        eveniment3.descriere(optionale2);
        eveniment3.descriere(optionale3);
        eveniment3.descriere(optionale4);



    }


}
