package exercitiul7.classes;

import exercitiul3.classes.Calator;

public abstract class AHandler {

    private AHandler urmator;

    public AHandler getUrmator() {
        return urmator;
    }

    public void setUrmator(AHandler urmator) {
        this.urmator = urmator;
    }

    public abstract void repartizeazaCererile(ClientService clientService);


}
