package exercitiul7.classes;

public abstract class Adecorator implements Ifactura{


    private Ifactura ifactura;

    public Adecorator(Ifactura ifactura) {
        this.ifactura = ifactura;
    }

    @Override
    public void emiteFactura() {
        ifactura.emiteFactura();
    }
}
