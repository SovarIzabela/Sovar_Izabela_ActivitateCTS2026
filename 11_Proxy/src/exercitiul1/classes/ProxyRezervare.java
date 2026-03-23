package exercitiul1.classes;

public class ProxyRezervare implements Irezervare{


    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void creazaRezervare() {
        if(rezervare.getNumarPersoane()>=4){
            rezervare.creazaRezervare();
        }else{
            System.out.println("Nu este nevoie de rezervare pentru mai putin de 4 persoane!");
        }
    }
}
