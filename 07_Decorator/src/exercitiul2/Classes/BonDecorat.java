package exercitiul2.Classes;

public class BonDecorat extends Adecorator{
    public BonDecorat(Ibon bon) {
        super(bon);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!");
    }
}
