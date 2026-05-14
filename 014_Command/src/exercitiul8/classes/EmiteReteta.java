package exercitiul8.classes;

public class EmiteReteta implements ICommand{

   private  IPersonalMedical personalMedical;

    public EmiteReteta(IPersonalMedical personalMedical) {
        this.personalMedical = personalMedical;
    }

    @Override
    public void executa() {
        personalMedical.emiteReteta();
    }
}
