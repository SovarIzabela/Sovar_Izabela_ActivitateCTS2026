package Exercitiul3.classes;

public class Card implements ICard{

    private float sumaCard;


    public Card(float sumaCard) {
        this.sumaCard = sumaCard;

    }

    @Override
    public void plateste(float valoarePlatita) {
        if(valoarePlatita<=sumaCard){
            sumaCard=sumaCard-valoarePlatita;
            System.out.println("S-a efectuat plata de ->"  + valoarePlatita);
            System.out.println("Sold ramas ->"  + sumaCard);
        }else{
            System.out.println("Fonduri insuficiente ! ");
        }


    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("sumaCard=").append(sumaCard);
        sb.append('}');
        return sb.toString();
    }
}
