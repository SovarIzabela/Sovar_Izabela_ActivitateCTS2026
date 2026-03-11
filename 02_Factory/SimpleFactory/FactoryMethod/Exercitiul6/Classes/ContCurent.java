package FactoryMethod.Exercitiul6.Classes;

public class ContCurent  implements ContBancar{


    private String titular;
    private float sold;

    public ContCurent(String titular, float sold) {
        this.titular = titular;
        this.sold = sold;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Acesa este Contul curent");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContCurent{");
        sb.append("titular='").append(titular).append('\'');
        sb.append(", sold=").append(sold);
        sb.append('}');
        return sb.toString();
    }
}
