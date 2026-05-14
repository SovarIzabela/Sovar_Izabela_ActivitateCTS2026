package exercitiul10.classes;

public class Director extends AHandler {

    @Override
    public void rezervare(Rezervare rezervare) {
        if(rezervare.getTipRezervare().equals("speciala")){
            System.out.println("Rezervarea este procesata de catre Directorul Restaurantului");
        }
    }
}
