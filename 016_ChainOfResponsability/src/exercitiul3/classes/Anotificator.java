package exercitiul3.classes;

public abstract class Anotificator {

    protected Anotificator urmator;



    public Anotificator getAnotificator() {
        return urmator;
    }

    public void setAnotificator(Anotificator anotificator) {
        this.urmator = anotificator;
    }




    public abstract void recomandaTransport(Calator calator);

}
