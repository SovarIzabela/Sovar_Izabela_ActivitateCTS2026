package exercitiul4.classes;

public class ElemOptionale {

    private String culoareTricou;
    private int pozitieTribuna;

    public ElemOptionale(String culoareTricou, int pozitieTribuna) {
        this.culoareTricou = culoareTricou;
        this.pozitieTribuna = pozitieTribuna;
    }


    @Override
    public String toString() {
        return "ElemOptionale{" +
                "culoareTricou='" + culoareTricou + '\'' +
                ", pozitieTribuna=" + pozitieTribuna +
                '}';
    }
}
