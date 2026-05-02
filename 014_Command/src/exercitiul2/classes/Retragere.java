package exercitiul2.classes;

public class Retragere implements Icomand{
    private ContBancar contBancar;
    private float suma;

    public Retragere(ContBancar contBancar, float suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    @Override
    public void execute() {
        contBancar.retragere(suma);
        System.out.println("S-a retras suma de " + suma);
    }

    @Override
    public void undo() {
        contBancar.depunere(suma);
    }
}
