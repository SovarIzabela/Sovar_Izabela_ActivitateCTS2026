package exercitiul11.classes;

public class LectiePlatforma implements AbstractLectiePlatforma{

    private String titlu;
    private String continut;

    public LectiePlatforma(String titlu, String continut) {
        this.titlu = titlu;
        this.continut = continut;
    }

    @Override
    public String obtineTitlu() {
        return titlu;
    }

    @Override
    public String obtineContinutStandardizat() {
        return continut;
    }
}
