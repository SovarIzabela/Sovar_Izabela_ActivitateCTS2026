package Exercitiul1.classes;

public class Pacient implements IObserver{

   private String numePacient;
   private int idPacient;
   private int varstaPacient;

    public Pacient(String numePacient, int varstaPacient, int idPacient) {
        this.numePacient = numePacient;
        this.varstaPacient = varstaPacient;
        this.idPacient = idPacient;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Pacientul " + numePacient + " a receptinat notificarea!");
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", idPacient=").append(idPacient);
        sb.append(", varstaPacient=").append(varstaPacient);
        sb.append('}');
        return sb.toString();
    }
}
