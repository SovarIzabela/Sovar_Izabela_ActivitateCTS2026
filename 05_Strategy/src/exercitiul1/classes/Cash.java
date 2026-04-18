package exercitiul1.classes;

public class Cash implements ImodPlata{
    @Override
    public void plateste(String numePacient, float sumaPlata) {
        System.out.println("Pacientul " + numePacient+ " a platit CASH suma de " + sumaPlata);
    }
}
