package exercitiul4.classes;

public class MasaMare extends AHandler{
    @Override
    public void repartizareClient(Client client) {
        if(client.getNrPersoane()<=10){
            System.out.println("Se recomanda o masa Mare");
        }else{
            super.getHandler().repartizareClient(client);

        }
    }
}
