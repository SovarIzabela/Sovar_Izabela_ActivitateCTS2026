package exercitiul11.classes;

public class Adapter implements AbstractLectiePlatforma{


    private IcontinutExtern icontinutExtern;

    public Adapter(IcontinutExtern icontinutExtern) {
        this.icontinutExtern = icontinutExtern;
    }

    @Override
    public String obtineTitlu() {
        return icontinutExtern.getNumeMaterial();
    }

    @Override
    public String obtineContinutStandardizat() {
        return icontinutExtern.getTextNeprelucrat();
    }
}
