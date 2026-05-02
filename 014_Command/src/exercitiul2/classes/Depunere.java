package exercitiul2.classes;

public class Depunere implements Icomand{
    private ContBancar contBancar;
    private float suma;

    public Depunere(ContBancar contBancar, float suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    @Override
    public void execute() {
        contBancar.depunere(suma);
        System.out.println("S-a depus suma de " + suma);
    }

    @Override
    public void undo() {
        contBancar.retragere(suma);
    }
}
