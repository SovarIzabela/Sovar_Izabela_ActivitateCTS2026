package exercitiul5.classes;

public class ManagerSucursala extends ABanca{
    @Override
    public void aprobareCredit(Client client) {
        if(client.getSumaSolicitata()>=5000&&client.getSumaSolicitata()<20000){
            System.out.println("Creditul poate fi aprobat de catre ManagerSucursala!");
        }else{

            super.getUrmator().aprobareCredit(client);
        }
    }
}
