package exercitiul2.Classes;

public class Adapter implements IMedicament {

    private IStocDepozit stocDepozit;
    private int idMed;

    public Adapter(IStocDepozit stocDepozit) {
        this.stocDepozit = stocDepozit;
    }

    @Override
    public void setareMedicament(int id) {
        this.idMed=id;
    }

    @Override
    public boolean verificaDisponibilitate(int nrMedicamenteDorite) {
        return stocDepozit.verificaStocPentruMedicament(idMed,nrMedicamenteDorite );
    }
}
