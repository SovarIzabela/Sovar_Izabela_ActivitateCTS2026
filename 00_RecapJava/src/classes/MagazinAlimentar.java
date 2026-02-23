package classes;

public class MagazinAlimentar extends Magazin{



    private boolean esteNonStop;


    public MagazinAlimentar(String denumireMagazin, int nrAngajati, String adresa, boolean esteNonStop) {
        super(denumireMagazin, nrAngajati, adresa);
        this.esteNonStop = esteNonStop;
    }

    public boolean isEsteNonStop() {
        return esteNonStop;
    }

    public void setEsteNonStop(boolean esteNonStop) {
        this.esteNonStop = esteNonStop;
    }

    @Override
    public void afiseazaMagazin() {
        System.out.println(super.afiseazaComun());
        System.out.println("Este NonStop? " + esteNonStop);
    }
}
