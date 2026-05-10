package exercitiul7.classes;

public class Decorator extends Adecorator{
    public Decorator(Ifactura ifactura) {
        super(ifactura);
    }


    @Override
    public void emiteFactura() {
        super.emiteFactura();
        System.out.println("Reducere speciala!");
    }
}
