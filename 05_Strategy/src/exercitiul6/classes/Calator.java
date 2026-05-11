package exercitiul6.classes;

public class Calator {

    private String numeCalator;
    private Ivalidator validator;

    public Calator(String numeCalator) {
        this.numeCalator = numeCalator;
        this.validator = new CardCalatorii();
    }

    public void setValidator(Ivalidator validator) {
        this.validator = validator;
    }

    public void platesteCalatorie(float pretBilet) {
       validator.platesteCalatorie(pretBilet);
    }



}
