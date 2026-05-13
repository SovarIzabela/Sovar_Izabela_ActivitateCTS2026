package exercitiul8.classes;

public class Decorator extends ADecorator{
    public Decorator(Icafenea cafenea) {
        super(cafenea);
    }


    @Override
    public void emiteBon(float valoare) {
        super.emiteBon(valoare);
        System.out.println("La multi ani !");
    }
}
