package exercitiul5.classes;

public class Internare implements Iinternare{
    @Override
    public void interneazaPacient(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNumePacient() + " se interneaza");
    }
}
