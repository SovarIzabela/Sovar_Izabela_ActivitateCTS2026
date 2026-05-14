package exercitiul10.classes;

public class Decorator extends ADecorator {
    public Decorator(IBiletAvion biletAvion) {
        super(biletAvion);
    }

    @Override
    public void genereazaBiletAvion() {
        super.genereazaBiletAvion();
        System.out.println("Multumim ca zburati cu noi!");

    }
}
