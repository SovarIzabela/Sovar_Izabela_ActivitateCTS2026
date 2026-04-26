package exercitiul2.classes;

public class VanzareMedicamente extends AVanzareMedicamente{

    public VanzareMedicamente(int idReteta) {
        super(idReteta);
    }

    @Override
    public void primireReteta() {
        System.out.println("S-a primit reteta cu ID-ul !" + this.idReteta);
    }

    @Override
    public boolean verificareStoc() {
        return true;
    }

    @Override
    public void inacseazaBanii() {
        System.out.println("Se incaseaza banii !");
    }

    @Override
    public void scadeStoc() {
        System.out.println("Medicamentele se scad din stoc!");
    }

    @Override
    public void emiteBon() {
        System.out.println("Se emite bonul fiscal!");
    }

    @Override
    public void aducereMed() {
        System.out.println("Se aduc medicamentele!");
    }
}
