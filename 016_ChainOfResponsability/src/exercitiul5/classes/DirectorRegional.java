package exercitiul5.classes;

public class DirectorRegional extends ABanca{
    @Override
    public void aprobareCredit(Client client) {
        if(client.getSumaSolicitata()>20000&&client.getSumaSolicitata()<=100000){
            System.out.println("Creditul poate fi aprobat de catre Director Regional!");
        }else{

            super.getUrmator().aprobareCredit(client);
        }
    }
}
