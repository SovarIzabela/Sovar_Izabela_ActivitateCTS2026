package exercitiul9.classes;

public class Bilet implements IBilet{

    private int idBilet;
    private String numeFilm;
    private boolean Imax;


    public Bilet(int idBilet, String numeFilm, boolean imax) {
        this.idBilet = idBilet;
        this.numeFilm = numeFilm;
        Imax = imax;
    }

    @Override
    public void tiparesteBilet(int idBilet) {
        System.out.println("Se tipareste biletul " + idBilet + " film " + numeFilm);
    }
}
