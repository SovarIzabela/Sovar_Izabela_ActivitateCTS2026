package Exercitiul6.Classes;

public class ConfiguratieAutobuz implements IConfiguratieAutobuz{

    private String modelAutobuz;
    private int anFabricatie;
    private int nrLocuri;
    private String tipCombustibil;
    private boolean areSistemSiguranta;

    public ConfiguratieAutobuz(String modelAutobuz, int anFabricatie, int nrLocuri, String tipCombustibil, boolean areSistemSiguranta) {
        this.modelAutobuz = modelAutobuz;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
        this.tipCombustibil = tipCombustibil;
        this.areSistemSiguranta = areSistemSiguranta;
    }

    public ConfiguratieAutobuz() {
    }

    public String getModelAutobuz() {
        return modelAutobuz;
    }

    public void setModelAutobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
    }

    @Override
    public IConfiguratieAutobuz copiaza() {
        IConfiguratieAutobuz copy = new ConfiguratieAutobuz();
        ((ConfiguratieAutobuz)copy).modelAutobuz = this.modelAutobuz;
        ((ConfiguratieAutobuz)copy).anFabricatie = this.anFabricatie;
        ((ConfiguratieAutobuz)copy).nrLocuri = this.nrLocuri;
        ((ConfiguratieAutobuz)copy).tipCombustibil = this.tipCombustibil;
        ((ConfiguratieAutobuz)copy).areSistemSiguranta = this.areSistemSiguranta;


        return copy;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfiguratieAutobuz{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", tipCombustibil='").append(tipCombustibil).append('\'');
        sb.append(", areSistemSiguranta=").append(areSistemSiguranta);
        sb.append('}');
        return sb.toString();
    }
}
