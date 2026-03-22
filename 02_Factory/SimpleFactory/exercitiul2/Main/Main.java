package exercitiul2.Main;

import exercitiul2.Classes.AMedicament;
import exercitiul2.Classes.Factory;
import exercitiul2.Classes.TipMedicament;

public class Main {


   public static void main(String[] args) throws Exception {

        Factory f1 = new Factory();

       AMedicament med1 = f1.returneazaMedicament(TipMedicament.DURERE,"Nurofen", 20);
       AMedicament med2 = f1.returneazaMedicament(TipMedicament.RACEALA, "Fervex", 30);

       med1.descriere();
       med2.descriere();





    }



}
