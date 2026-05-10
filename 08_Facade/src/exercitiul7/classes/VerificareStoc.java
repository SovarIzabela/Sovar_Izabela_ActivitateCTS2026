package exercitiul7.classes;

public class VerificareStoc {

    private int stocProdus;

    public VerificareStoc(int stocProdus) {
        this.stocProdus = stocProdus;
    }

    public void verificareStocProdus(){
        System.out.println("S-a verificat stocul produsului!");

    }

    @Override
    public String toString() {
        return "VerificareStoc{" +
                "stocProdus=" + stocProdus +
                '}';
    }
}
