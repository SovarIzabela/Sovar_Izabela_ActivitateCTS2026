package exercitiul6.main;

import exercitiul6.classes.ABiletDecorat;
import exercitiul6.classes.BiletCalatorie;
import exercitiul6.classes.BiletDecorat;
import exercitiul6.classes.IBiletCalatorie;

public class Main {

    public static void main(String[] args){


        IBiletCalatorie biletCalatorie = new BiletCalatorie("STB", 25, "ABC123");
        biletCalatorie.printeazaBilet();

        ABiletDecorat biletDecorat = new BiletDecorat(biletCalatorie);
        biletDecorat.printeazaBilet();


    }


}
