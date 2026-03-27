package exercitiul2.Classes;

public class BonDeCasa implements Ibon{

    private int idBon;
    private float valoareTotala;

    public BonDeCasa(int idBon, float valoareTotala) {
        this.idBon = idBon;
        this.valoareTotala = valoareTotala;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BonDeCasa{");
        sb.append("idBon=").append(idBon);
        sb.append(", valoareTotala=").append(valoareTotala);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printeazaBon() {
        System.out.println(idBon+valoareTotala);
    }
}
