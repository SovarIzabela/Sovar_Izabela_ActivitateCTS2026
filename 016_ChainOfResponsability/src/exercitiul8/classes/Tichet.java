package exercitiul8.classes;

public class Tichet {

    private int idTichet;
    private int dificultate;

    public Tichet(int idTichet, int dificultate) {
        this.idTichet = idTichet;
        this.dificultate = dificultate;
    }

    public int getIdTichet() {
        return idTichet;
    }

    public int getDificultate() {
        return dificultate;
    }

    public void setIdTichet(int idTichet) {
        this.idTichet = idTichet;
    }

    public void setDificultate(int dificultate) {
        this.dificultate = dificultate;
    }

    @Override
    public String toString() {
        return "Tichet{" +
                "idTichet=" + idTichet +
                ", dificultate=" + dificultate +
                '}';
    }
}
