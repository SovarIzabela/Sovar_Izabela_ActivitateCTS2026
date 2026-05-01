package exercitiul3.classes;

public class PlataCash  implements IModPlata{
    @Override
    public void plateste(String numeClient, float sumaPlatita) {
        System.out.println("Clientul a platit Cash suma de " + sumaPlatita);
    }
}
