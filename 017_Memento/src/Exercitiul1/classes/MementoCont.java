package Exercitiul1.classes;

public class MementoCont {

    private float suma;

    public MementoCont(float suma) {
        this.suma = suma;
    }

    public float getSuma() {
        return suma;
    }



    @Override
    public String toString() {
        return "MementoCont{" +
                "suma=" + suma +
                '}';
    }
}
