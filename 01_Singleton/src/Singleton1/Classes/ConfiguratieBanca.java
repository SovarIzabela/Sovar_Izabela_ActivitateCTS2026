package Singleton1.Classes;

public class ConfiguratieBanca {

    private float comisionAdministrare;
    private float dobandaStandard;
    private int limitaTransferZi;

    private static ConfiguratieBanca instanta = null;

    private ConfiguratieBanca(float comisionAdministrare, float dobandaStandard, int limitaTransferZi) {
        this.comisionAdministrare = comisionAdministrare;
        this.dobandaStandard = dobandaStandard;
        this.limitaTransferZi = limitaTransferZi;
    }



    public static synchronized ConfiguratieBanca getInstance(){
        if(instanta==null){
            instanta = new ConfiguratieBanca(0.05f,0.02f, 20000);
        }

        return instanta;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfiguratieBanca{");
        sb.append("comisionAdministrare=").append(comisionAdministrare);
        sb.append(", dobandaStandard=").append(dobandaStandard);
        sb.append(", limitaTransferZi=").append(limitaTransferZi);
        sb.append('}');
        return sb.toString();
    }
}
