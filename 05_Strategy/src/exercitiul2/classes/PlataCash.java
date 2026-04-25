package exercitiul2.classes;

public class PlataCash implements  IPlata{
    @Override
    public void plateste(String client, double valoare) {
        System.out.println("Clientul " + client + " a platit  CASH valoarea de => " + valoare);
    }
}
