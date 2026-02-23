package classes;

public class MagazinBricolaj extends Magazin{

    private boolean oferaTransport;


    public MagazinBricolaj(String denumireMagazin, int nrAngajati, String adresa, boolean oferaTransport) {
        super(denumireMagazin, nrAngajati, adresa);
        this.oferaTransport = oferaTransport;
    }

    public boolean isOferaTransport() {
        return oferaTransport;
    }

    public void setOferaTransport(boolean oferaTransport) {
        this.oferaTransport = oferaTransport;
    }

    @Override
    public void afiseazaMagazin() {
        System.out.println(super.afiseazaComun());
        System.out.println("Ofera Transport Gratuit? " + oferaTransport);
    }
}
