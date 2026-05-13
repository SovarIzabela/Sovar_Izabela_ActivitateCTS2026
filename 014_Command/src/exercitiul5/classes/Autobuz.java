package exercitiul5.classes;

public class Autobuz implements Iautobuz{

    private int numarLinie;

    public Autobuz(int numarLinie) {
        this.numarLinie = numarLinie;
    }

    @Override
    public void plecareAutobuz(int numarLinie) {
        System.out.println("Autobuzul a plecat pe linia" + numarLinie);
    }
}
