package exercitiul11.classes;

public class DecoratorRestaurant extends ADecoratorRestaurant{

    private String toppingAles;


    public DecoratorRestaurant(IProdus produs, String toppingAles) {
        super(produs);
        this.toppingAles = toppingAles;

    }

    @Override
    public void comandaProdus() {
        super.comandaProdus();
        System.out.println("Se adauga suplimentar si topping !"+ toppingAles);
    }
}
