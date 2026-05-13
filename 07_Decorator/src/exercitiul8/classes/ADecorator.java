package exercitiul8.classes;

public abstract class ADecorator  implements Icafenea{

    private Icafenea cafenea;

    public ADecorator(Icafenea cafenea) {
        this.cafenea = cafenea;
    }

    @Override
    public void emiteBon(float valoare) {
        cafenea.emiteBon(valoare);
    }
}
