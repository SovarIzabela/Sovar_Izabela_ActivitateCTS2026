package exercitiul10.classes;

public class BiletAvion implements IBiletAvion{


    private String numePasager;
    private String destinatia;
    private float pret;

    public BiletAvion(String numePasager, String destinatia, float pret) {
        this.numePasager = numePasager;
        this.destinatia = destinatia;
        this.pret = pret;
    }

    @Override
    public void genereazaBiletAvion() {
        System.out.println("S-a generat biletul pentru pasagerul:  " + numePasager + " destinatia " + destinatia);
    }
}
