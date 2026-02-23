package classes;

public class MagazinBauturi extends Magazin{

    private TipBautura tipBautura;


    public MagazinBauturi(String denumireMagazin, int nrAngajati, String adresa, TipBautura tipBautura) {
        super(denumireMagazin, nrAngajati, adresa);
        this.tipBautura = tipBautura;
    }

    public TipBautura getTipBautura() {
        return tipBautura;
    }

    public void setTipBautura(TipBautura tipBautura) {
        this.tipBautura = tipBautura;
    }

    @Override
    public void afiseazaMagazin() {
        System.out.println(super.afiseazaComun());
        System.out.println("Tip Bautura" + tipBautura);

    }
}
