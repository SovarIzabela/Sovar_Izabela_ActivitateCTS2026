package exercitiul10.classes;

public class Manager extends AHandler{
    @Override
    public void rezervare(Rezervare rezervare) {

        if(rezervare.getTipRezervare().equals("vip")){
            System.out.println("Rezervarea este efectuata de Manager!");
        }else{
            super.getUrmator().rezervare(rezervare);
        }

    }
}
