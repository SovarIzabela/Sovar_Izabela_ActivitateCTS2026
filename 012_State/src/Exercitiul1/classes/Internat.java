package Exercitiul1.classes;

public class Internat implements Istare{
    @Override
    public void doAction(Pacient pacient) {
        System.out.println("Pacientul cu numele " + pacient.getNumePacient() + "a trecut in stare Internat");
        pacient.setStare(this);
    }
}
