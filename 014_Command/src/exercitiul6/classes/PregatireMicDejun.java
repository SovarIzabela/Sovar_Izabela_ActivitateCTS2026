package exercitiul6.classes;

public class PregatireMicDejun implements ICommand{

    private IPersonal personal;

    public PregatireMicDejun(IPersonal personal) {
        this.personal = personal;
    }

    @Override
    public void executa() {
        personal.pregatireMicDejun();
    }
}
