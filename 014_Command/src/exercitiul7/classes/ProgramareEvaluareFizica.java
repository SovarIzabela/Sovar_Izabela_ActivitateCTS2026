package exercitiul7.classes;

public class ProgramareEvaluareFizica implements Icommand{

    private IAntrenor antrenor;

    public ProgramareEvaluareFizica(IAntrenor antrenor) {
        this.antrenor = antrenor;
    }

    @Override
    public void executa() {
        antrenor.programareEvaluare();
    }
}
