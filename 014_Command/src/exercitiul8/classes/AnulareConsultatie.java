package exercitiul8.classes;

public class AnulareConsultatie implements ICommand{


    private IPersonalMedical personalMedical ;

    public AnulareConsultatie(IPersonalMedical personalMedical) {
        this.personalMedical = personalMedical;
    }

    @Override
    public void executa() {
        personalMedical.anulareConsultatie();
    }
}
