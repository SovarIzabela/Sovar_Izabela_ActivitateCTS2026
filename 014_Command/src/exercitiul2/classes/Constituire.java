package exercitiul2.classes;

public class Constituire implements Icomand{

    private ContBancar contBancar;
    private float suma;

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public Constituire(ContBancar contBancar, float suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    @Override
    public void execute() {
        contBancar.constituire(suma);
        System.out.println("S-a constituit contul cu suma de " + suma);
    }

    @Override
    public void undo() {
        contBancar.setSumaCont(0);
    }
}
