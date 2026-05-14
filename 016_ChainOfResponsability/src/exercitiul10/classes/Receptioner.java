package exercitiul10.classes;

public class Receptioner extends AHandler{
    @Override
    public void rezervare(Rezervare rezervare) {
        if(rezervare.getTipMasa().equals("libera")){
            System.out.println("Rezervarea este efectuata de Receptioner!");
        }else{
            super.getUrmator().rezervare(rezervare);
        }
    }
}
