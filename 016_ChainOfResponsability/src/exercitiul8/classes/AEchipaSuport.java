package exercitiul8.classes;

public abstract class AEchipaSuport {

    protected AEchipaSuport urmator;

    public AEchipaSuport getUrmator() {
        return urmator;
    }

    public void setUrmator(AEchipaSuport urmator) {
        this.urmator = urmator;
    }


    public abstract void repartizeazaTichete(Tichet tichet);


}
