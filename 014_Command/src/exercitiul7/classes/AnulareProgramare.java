package exercitiul7.classes;

public class AnulareProgramare implements Icommand{

    private IAntrenor antrenor;

    public AnulareProgramare(IAntrenor antrenor) {
        this.antrenor = antrenor;
    }

    @Override
    public void executa() {
        antrenor.anulareProgramare();
    }
}
