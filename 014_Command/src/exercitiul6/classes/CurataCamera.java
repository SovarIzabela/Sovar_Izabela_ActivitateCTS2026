package exercitiul6.classes;

public class CurataCamera implements ICommand{

    private IPersonal personal;

    public CurataCamera(IPersonal personal) {
        this.personal = personal;
    }

    @Override
    public void executa() {
        personal.curataCamera();
    }
}
