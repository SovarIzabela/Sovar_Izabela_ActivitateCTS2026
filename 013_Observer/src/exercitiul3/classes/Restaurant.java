package exercitiul3.classes;

import java.util.List;

public class Restaurant implements IRestaurant{

   private String numeRestaurant;
    private List<Iobserver>  listaClienti;

    public Restaurant(String numeRestaurant, List<Iobserver> listaClienti) {
        this.numeRestaurant = numeRestaurant;
        this.listaClienti = listaClienti;
    }

    @Override
    public void adaugaClient(Iobserver iobserver) {
        listaClienti.add(iobserver);
    }

    @Override
    public void stergeClient(Iobserver iobserver) {
        listaClienti.remove(iobserver);
    }

    @Override
    public void notificaClient(String mesaj) {
        for(Iobserver client: listaClienti){
            client.receptioneazaNotificare(mesaj);
        }
    }

    public void notificareOfertaPret(){
        notificaClient("S-a adaugat o noua oferta de Pret in restaurantul nostru!");
    }

    public void notificareMeniuNou(){
        notificaClient("Incepand de luna aceasta s-a adaugat un meniu nou !");
    }


}
