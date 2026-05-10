package exercitiul8.classes;

public class ElementeOptionale {


    private int loc;
    private int rand;

    public ElementeOptionale(int loc, int rand) {
        this.loc = loc;
        this.rand = rand;
    }

    @Override
    public String toString() {
        return "ElementeOptionale{" +
                "loc=" + loc +
                ", rand=" + rand +
                '}';
    }
}
