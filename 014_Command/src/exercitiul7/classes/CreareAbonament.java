package exercitiul7.classes;

public class CreareAbonament implements Icommand{
    private IAntrenor antrenor;

    public CreareAbonament(IAntrenor antrenor) {
        this.antrenor = antrenor;
    }

    @Override
    public void executa() {
        antrenor.creareAbonament();
    }
}
