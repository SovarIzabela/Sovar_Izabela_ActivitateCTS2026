package exercitiul7.classes;

public class OptionaleCopac {

    private int pozitieX;
    private int pozitieY;

    public OptionaleCopac(int pozitieX, int pozitieY) {
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
    }


    public int getPozitieX() {
        return pozitieX;
    }

    public int getPozitieY() {
        return pozitieY;
    }


    @Override
    public String toString() {
        return "OptionaleCopac{" +
                "pozitieX=" + pozitieX +
                ", pozitieY=" + pozitieY +
                '}';
    }
}
