package exercitiul1.classes;

public class Card implements ImodPlata{
    @Override
    public void plateste(String numePacient, float sumaPlata) {
        System.out.println("Pacientul " + numePacient+ " a platit CARD suma de " + sumaPlata);
    }
}
