package exercitiul4.Classes;

public class AdapterBilet implements IaplicatiaExistenta{

    private AplicatiaEBilet aplicatiaEBilet;

    public AdapterBilet(AplicatiaEBilet aplicatiaEBilet) {
        this.aplicatiaEBilet = aplicatiaEBilet;
    }

    @Override
    public void rezervaBilet() {
        aplicatiaEBilet.vindeBilet();
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AdapterBilet{");
        sb.append("aplicatiaEBilet=").append(aplicatiaEBilet);
        sb.append('}');
        return sb.toString();
    }
}
