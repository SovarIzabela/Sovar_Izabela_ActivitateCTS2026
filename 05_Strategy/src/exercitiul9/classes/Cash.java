package exercitiul9.classes;

public class Cash implements IModPlata{
    @Override
    public void plateste(float valoare) {
        System.out.println("S-a efectuat plata CASH in valoare de " + valoare);
    }
}
