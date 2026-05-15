package exercitiul11.classes;

public abstract class ADecoratorRestaurant implements IProdus{


    private IProdus produs;

    public ADecoratorRestaurant(IProdus produs) {
        this.produs = produs;
    }

    @Override
    public void comandaProdus() {
        produs.comandaProdus();
    }
}
