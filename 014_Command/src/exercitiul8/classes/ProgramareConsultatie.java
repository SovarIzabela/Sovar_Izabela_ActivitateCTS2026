package exercitiul8.classes;

public class ProgramareConsultatie implements ICommand{

   private IPersonalMedical personalMedical;

    public ProgramareConsultatie(IPersonalMedical personalMedical) {
        this.personalMedical = personalMedical;
    }

    @Override
    public void executa() {
        personalMedical.programareConsultatie();
    }
}
