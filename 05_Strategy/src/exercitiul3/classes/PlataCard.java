package exercitiul3.classes;

public class PlataCard implements IModPlata{
    @Override
    public void plateste(String numeClient, float sumaPlatita) {
        System.out.println("Clientul a platit Card suma de " + sumaPlatita);
    }
}
