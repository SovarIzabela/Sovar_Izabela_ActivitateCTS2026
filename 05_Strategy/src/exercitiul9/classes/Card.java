package exercitiul9.classes;

public class Card implements IModPlata {


    @Override
    public void plateste(float valoare) {
        System.out.println("S-a efectuat plata Card in valoare de " + valoare);
    }
}
