package Exercitiul1.classes;

public class Pacient {

    private String numePacient;
    private int idPacient;
    private Istare stare;

    public Pacient(String numePacient, int idPacient) {
        this.numePacient = numePacient;
        this.idPacient = idPacient;
        this.stare = null;

    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public Istare getStare() {
        return stare;
    }

    public void setStare(Istare stare) {
        this.stare = stare;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", idPacient=").append(idPacient);
        sb.append(", stare=").append(stare);
        sb.append('}');
        return sb.toString();
    }
}
