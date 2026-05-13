package exercitiul7.classes;

public class SefService extends AHandler{
    @Override
    public void repartizeazaCererile(ClientService clientService) {
        if(clientService.getGravitate().equals("grav")){
            System.out.println("Repartizat catre SefService!");
        }else{
            super.getUrmator().repartizeazaCererile(clientService);
        }
    }
}
