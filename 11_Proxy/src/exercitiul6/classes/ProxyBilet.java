package exercitiul6.classes;

public class ProxyBilet implements IvanzareBilet{

    private VanzareBilet vanzareBilet;

    public ProxyBilet(VanzareBilet vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vindeBilet(Client client) {
        if(client.getVarsta()>=14){
            vanzareBilet.vindeBilet(client);
        }else{
            System.out.println("Nu se vand bilete pentru persoanele sub 14 ani!");
        }
    }
}
