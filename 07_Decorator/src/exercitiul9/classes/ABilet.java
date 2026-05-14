package exercitiul9.classes;

public abstract class ABilet implements IBilet {


    private IBilet bilet;

    public ABilet(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void tiparesteBilet(int idBilet) {
        bilet.tiparesteBilet(idBilet);
    }
}
