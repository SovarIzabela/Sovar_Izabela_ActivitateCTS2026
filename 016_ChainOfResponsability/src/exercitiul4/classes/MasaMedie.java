package exercitiul4.classes;

public class MasaMedie extends AHandler{
    @Override
    public void repartizareClient(Client client) {

        if(client.getNrPersoane()>=3&&client.getNrPersoane()<=5){
            System.out.println("Se recomanda o masa Medie");
        }else{
            super.getHandler().repartizareClient(client);

        }


    }
}
