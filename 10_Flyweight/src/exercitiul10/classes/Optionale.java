package exercitiul10.classes;

public class Optionale {

    private int pozitieX;
    private int pozitieY;
    private int viteza;
    private int nivelCombustibil;

    public Optionale(int pozitieX, int pozitieY, int viteza, int nivelCombustibil) {
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.viteza = viteza;
        this.nivelCombustibil = nivelCombustibil;
    }

    @Override
    public String toString() {
        return "Optionale{" +
                "pozitieX=" + pozitieX +
                ", pozitieY=" + pozitieY +
                ", viteza=" + viteza +
                ", nivelCombustibil=" + nivelCombustibil +
                '}';
    }
}
