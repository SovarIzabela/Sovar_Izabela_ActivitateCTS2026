package FactoryMethod.Exercitiul6.Classes;

public class ContPremium implements ContBancar{

    private String titular;
    private float sold;

    public ContPremium(String titular, float sold) {
        this.titular = titular;
        this.sold = sold;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Acesa este Contul Premium");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContPremium{");
        sb.append("titular='").append(titular).append('\'');
        sb.append(", sold=").append(sold);
        sb.append('}');
        return sb.toString();
    }
}
