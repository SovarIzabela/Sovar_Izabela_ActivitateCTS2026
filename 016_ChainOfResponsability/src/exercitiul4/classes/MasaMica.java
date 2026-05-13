package exercitiul4.classes;

public class MasaMica extends AHandler{
    @Override
    public void repartizareClient(Client client) {
        if(client.getNrPersoane()<=2){
            System.out.println("Se recomanda o masa Mica");
        }else{
            super.getHandler().repartizareClient(client);

        }
    }
}
