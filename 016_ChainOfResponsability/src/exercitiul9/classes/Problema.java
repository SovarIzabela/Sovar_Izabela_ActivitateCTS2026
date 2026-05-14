package exercitiul9.classes;

public class Problema {

    private int idProblema;
    private String gravitate;

    public Problema(int idProblema, String gravitate) {
        this.idProblema = idProblema;
        this.gravitate = gravitate;
    }

    public int getIdProblema() {
        return idProblema;
    }

    public String getGravitate() {
        return gravitate;
    }
}
