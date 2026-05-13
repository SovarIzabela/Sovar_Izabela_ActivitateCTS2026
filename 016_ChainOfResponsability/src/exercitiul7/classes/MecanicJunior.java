package exercitiul7.classes;

public class MecanicJunior extends AHandler{
    @Override
    public void repartizeazaCererile(ClientService clientService) {
        if(clientService.getGravitate().equals("minor")){
            System.out.println("Repartizat catre MecanicJunior!");
        }else{
            super.getUrmator().repartizeazaCererile(clientService);
        }
    }
}
