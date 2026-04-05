package Exercitiul3.classes;

public abstract class ACardDecorat implements ICard {


  private  ICard card;

    public ACardDecorat(ICard card) {
        this.card = card;
    }

    @Override
    public void plateste(float valoarePlatita) {
        card.plateste(valoarePlatita);
    }
}
