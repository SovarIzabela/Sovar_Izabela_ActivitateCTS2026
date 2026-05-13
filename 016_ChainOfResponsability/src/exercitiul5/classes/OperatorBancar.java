package exercitiul5.classes;

public class OperatorBancar extends ABanca {
    @Override
    public void aprobareCredit(Client client) {
        if(client.getSumaSolicitata()<5000){
            System.out.println("Creditul poate fi aprobat de catre Operator!");
        }else{

            super.getUrmator().aprobareCredit(client);
        }
    }
}
