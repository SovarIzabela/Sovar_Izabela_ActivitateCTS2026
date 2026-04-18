package exercitiul1.main;

import exercitiul1.classes.Card;
import exercitiul1.classes.Cash;
import exercitiul1.classes.Pacient;

public class Main {

    public static void main(String [] args){
        Pacient pacient = new Pacient("Sovar Izabela" , 101, 39, true);
        Pacient pacient2 = new Pacient("Popescu Maria" , 101, 39, true, new Cash());


        pacient.plateste(2000);
        pacient2.plateste(2500);

        pacient2.setImodPlata(new Card());
        pacient2.plateste(500);


    }
}
