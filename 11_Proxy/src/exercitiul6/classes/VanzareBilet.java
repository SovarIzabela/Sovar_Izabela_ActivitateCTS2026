package exercitiul6.classes;

public class VanzareBilet implements IvanzareBilet{
    @Override
    public void vindeBilet(Client client) {
        System.out.println("S-a vandut biletul pentru clientul " + client.getNumeClient());
    }
}
