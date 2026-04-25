package exercitiul2.classes;

public class PlataCard implements IPlata{
    @Override
    public void plateste(String client, double valoare) {
        System.out.println("Clientul " + client + " a platit  CARD valoarea de => " + valoare);
    }
}
