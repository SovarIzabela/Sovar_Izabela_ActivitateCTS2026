package exercitiul4.classes;

public abstract class AHandler {

    protected AHandler urmator;

    public AHandler getHandler() {
        return urmator;
    }

    public void setHandler(AHandler handler) {
        this.urmator = handler;
    }


    public abstract void repartizareClient(Client client);


}
