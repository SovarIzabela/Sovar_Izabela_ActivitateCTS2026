package exercitiul2.classes;

public abstract class Anotificator {


    private Anotificator anotificator;

    public Anotificator getAnotificator() {
        return anotificator;
    }

    public void setAnotificator(Anotificator anotificator) {
        this.anotificator = anotificator;
    }


    public abstract void notificaClient(ClientFidel clientFidel, String mesaj);


}
