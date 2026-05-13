package exercitiul9.classes;

public class Soldat implements ISoldat{

    private int tipSoldat;
    private String tipArmura;
    private String modelArma;
    private String culoareUniforma;


    public Soldat(int tipSoldat, String tipArmura, String modelArma, String culoareUniforma) {
        this.tipSoldat = tipSoldat;
        this.tipArmura = tipArmura;
        this.modelArma = modelArma;
        this.culoareUniforma = culoareUniforma;
    }

    @Override
    public void afiseazaSoldat(Optionale optionale) {
        System.out.println(this.toString() + optionale.toString());
    }


    @Override
    public String toString() {
        return "Soldat{" +
                "tipSoldat=" + tipSoldat +
                ", tipArmura='" + tipArmura + '\'' +
                ", modelArma='" + modelArma + '\'' +
                ", culoareUniforma='" + culoareUniforma + '\'' +
                '}';
    }
}
