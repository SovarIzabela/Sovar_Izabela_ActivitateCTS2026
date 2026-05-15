package exercitiul11.classes;

public class ContinutExtern implements IcontinutExtern{

    private String numeMaterial;
    private String textNeprelucrat;


    public ContinutExtern(String numeMaterial, String textNeprelucrat) {
        this.numeMaterial = numeMaterial;
        this.textNeprelucrat = textNeprelucrat;
    }

    @Override
    public String getNumeMaterial() {
        return numeMaterial;
    }

    @Override
    public String getTextNeprelucrat() {
        return textNeprelucrat;
    }
}
