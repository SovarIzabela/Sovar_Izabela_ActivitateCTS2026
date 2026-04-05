package Exercitiul3.classes;

public class CardDecorat extends ACardDecorat{
    public CardDecorat(ICard card) {
        super(card);
    }

    @Override
    public void plateste(float valoarePlatita) {
        super.plateste(valoarePlatita);
        System.out.println("S-a efectuat plata Contactless!");
    }
}
