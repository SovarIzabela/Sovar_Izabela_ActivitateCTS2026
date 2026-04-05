package Exercitiul3.main;

import Exercitiul3.classes.ACardDecorat;
import Exercitiul3.classes.Card;
import Exercitiul3.classes.CardDecorat;
import Exercitiul3.classes.ICard;

public class Main {

    public static void main(String[] args){

        ICard card = new Card(1500);
        card.plateste(100);

        ACardDecorat cardConctless = new CardDecorat(card);
        cardConctless.plateste(1000);


    }
}
