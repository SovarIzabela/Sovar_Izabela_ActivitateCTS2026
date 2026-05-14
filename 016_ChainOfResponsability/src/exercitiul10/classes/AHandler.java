package exercitiul10.classes;

public abstract class AHandler {

    private AHandler urmator;

    public AHandler getUrmator() {
        return urmator;
    }

    public void setUrmator(AHandler urmator) {
        this.urmator = urmator;
    }



    public abstract void rezervare(Rezervare rezervare);
}
