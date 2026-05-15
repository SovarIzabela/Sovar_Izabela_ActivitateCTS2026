package exercitiul11.classes;

public class Produs implements IProdus{

    private String numeProdus;
    private float pretProdus;

    public Produs(String numeProdus, float pretProdus) {
        this.numeProdus = numeProdus;
        this.pretProdus = pretProdus;
    }

    @Override
    public void comandaProdus() {
        System.out.println("S-a comandat produsul " + numeProdus + " pret: " + pretProdus);
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public float getPretProdus() {
        return pretProdus;
    }

    public void setPretProdus(float pretProdus) {
        this.pretProdus = pretProdus;
    }
}
