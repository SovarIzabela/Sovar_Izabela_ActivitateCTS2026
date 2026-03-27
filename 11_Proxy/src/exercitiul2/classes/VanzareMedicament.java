package exercitiul2.classes;

public class VanzareMedicament implements IvanzareMedicament{

    private String numeClient;
    private int idClient;
    private boolean areReteta;

    public VanzareMedicament(String numeClient, int idClient, boolean areReteta) {
        this.numeClient = numeClient;
        this.idClient = idClient;
        this.areReteta = areReteta;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public boolean isAreReteta() {
        return areReteta;
    }

    @Override
    public void vindeMedicament() {
        System.out.println("S-a vandut Medicamentul pentru clientul ->" + this.numeClient);
    }
}
