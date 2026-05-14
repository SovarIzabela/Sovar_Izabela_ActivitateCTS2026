package exercitiul9.classes;

public class Voucher implements IModPlata{
    @Override
    public void plateste(float valoare) {
        System.out.println("S-a efectuat plata Voucher in valoare de " + valoare);
    }
}
