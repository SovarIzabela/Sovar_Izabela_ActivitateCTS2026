package exercitiul3.classes;

public class Medic implements   Imedic{


    private String numemedic;
    private String sectie;

    public Medic(String numemedic, String sectie) {
        this.numemedic = numemedic;
        this.sectie = sectie;
    }

    @Override
    public void internare() {
        System.out.println("Se internareaza pacientului");
    }

    @Override
    public void tratare() {
        System.out.println("Se trateaza  pacientul");
    }
}
