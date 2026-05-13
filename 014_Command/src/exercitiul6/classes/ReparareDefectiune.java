package exercitiul6.classes;

public class ReparareDefectiune implements ICommand{

    private IPersonal personal;

    public ReparareDefectiune(IPersonal personal) {
        this.personal = personal;
    }

    @Override
    public void executa() {
        personal.reparareDefectiune();
    }
}
