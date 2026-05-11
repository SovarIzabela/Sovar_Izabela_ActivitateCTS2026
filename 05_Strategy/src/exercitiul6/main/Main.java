package exercitiul6.main;

import exercitiul6.classes.Calator;
import exercitiul6.classes.CardBancar;

public class Main {

    public static void main(String[] args){

        Calator c1 = new Calator("Calator1");
        c1.platesteCalatorie(25.0f);
        c1.setValidator(new CardBancar());
        c1.platesteCalatorie(25.0f);





    }


}
