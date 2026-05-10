package exercitiul8.classes;

public class SoftExtern implements  ISoftExtern{

    private float price;
    private float vat;

    public SoftExtern(float price, float vat) {
        this.price = price;
        this.vat = vat;
    }

    @Override
    public float getShippingPrice() {
        return price+ price*vat;
    }

    @Override
    public String toString() {
        return "SoftExtern{" +
                "price=" + price +
                ", vat=" + vat +
                '}';
    }
}
