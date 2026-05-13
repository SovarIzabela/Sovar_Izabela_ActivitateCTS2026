package exercitiul5.classes;

public abstract class ABanca {

    protected ABanca urmator;

    public ABanca getUrmator() {
        return urmator;
    }

    public void setUrmator(ABanca urmator) {
        this.urmator = urmator;
    }

    public abstract void  aprobareCredit(Client client);



}
