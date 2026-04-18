package Exercitiul1.classes;

public class SubObservatie implements Istare{
    @Override
    public void doAction(Pacient pacient) {
        System.out.println("Pacientul cu numele " + pacient.getNumePacient() + "a trecut in stare Externat");
        pacient.setStare(this);
    }
}
