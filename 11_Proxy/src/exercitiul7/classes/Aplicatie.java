package exercitiul7.classes;

public class Aplicatie implements Iaplicatie{

    private String numeAplicatie;
    private String numeFisier;
    private boolean userAutentificat;


    public Aplicatie(String numeAplicatie, String numeFisier, boolean userAutentificat) {
        this.numeAplicatie = numeAplicatie;
        this.numeFisier = numeFisier;
        this.userAutentificat = userAutentificat;
    }

    public String getNumeAplicatie() {
        return numeAplicatie;
    }

    public String getNumeFisier() {
        return numeFisier;
    }

    public boolean isUserAutentificat() {
        return userAutentificat;
    }

    @Override
    public void descarcaFisier() {
        System.out.println("Fisierul " + numeFisier+ "  a fost descarcat!");
    }
}
