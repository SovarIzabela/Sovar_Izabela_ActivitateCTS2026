package exercitiul4.classes;

public class MasaRestaurant implements IMasaRestaurant{

    private int numarMasa;
    private int numarPersoane;

    public MasaRestaurant(int numarMasa, int numarPersoane) {
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
    }

    @Override
    public void ocupareMasa() {
        System.out.println("S-a ocupat masa cu numarul " + this.numarMasa);
    }

    @Override
    public void rezervareMasa() {
        System.out.println("S-a rezervat masa cu numarul : " + this.numarMasa);
    }
}
