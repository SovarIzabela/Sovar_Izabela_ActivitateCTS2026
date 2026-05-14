package exercitiul9.classes;

public abstract class AService {

    protected AService urmator;




    public AService getUrmator() {
        return urmator;
    }

    public void setUrmator(AService urmator) {
        this.urmator = urmator;
    }


    public abstract void repartizeazaProbleme(Problema problema);


}
