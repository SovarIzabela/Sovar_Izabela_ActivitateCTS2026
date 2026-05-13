package exercitiul7.classes;

public class MecanicSenior extends AHandler{
    @Override
    public void repartizeazaCererile(ClientService clientService) {
        if(clientService.getGravitate().equals("mediu")){
            System.out.println("Repartizat catre MecanicSenior!");
        }else{
            super.getUrmator().repartizeazaCererile(clientService);
        }
    }
}
