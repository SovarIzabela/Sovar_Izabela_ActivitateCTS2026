package exercitiul10.classes;

public abstract class ADecorator implements IBiletAvion{

    protected IBiletAvion biletAvion;

    public ADecorator(IBiletAvion biletAvion) {
        this.biletAvion = biletAvion;
    }

    @Override
    public void genereazaBiletAvion() {
        biletAvion.genereazaBiletAvion();
    }
}
