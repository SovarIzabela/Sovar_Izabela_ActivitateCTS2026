package exercitiul6.classes;

public class AutobuzLinie implements IAutobuzLinie{

    private String model;
    private String anFabricatie;
    private int numarLocuri;


    public AutobuzLinie(String model, String anFabricatie, int numarLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.numarLocuri = numarLocuri;
    }


    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "model='" + model + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                ", numarLocuri=" + numarLocuri +
                '}';
    }

    @Override
    public void descriere(Optionale optionale) {
        System.out.println(this.toString()+optionale.toString());
    }
}
