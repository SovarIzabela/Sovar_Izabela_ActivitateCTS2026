package exercitiul3.classes;

public class ComandaInternare implements Icomand{

    private Imedic medic;

    public ComandaInternare(Imedic medic) {
        this.medic = medic;
    }

    @Override
    public void executa() {
        medic.internare();
    }
}
