package exercitiul3.classes;

public class ComandaTratare implements Icomand{

    private Imedic medic;

    public ComandaTratare(Imedic medic) {
        this.medic = medic;
    }

    @Override
    public void executa() {
        medic.tratare();
    }
}
