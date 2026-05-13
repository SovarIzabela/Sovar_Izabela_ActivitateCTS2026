package exercitiul7.main;

import exercitiul7.classes.*;

public class Main {

    public static void main(String[] args){

        ClientService clientService = new ClientService("Client1 ", "grav");

        AHandler mecanicJunior = new MecanicJunior();
        AHandler mecanicSenior = new MecanicSenior();
        AHandler sefService = new SefService();
        AHandler reprezentanta = new ReprezentantaAutorizata();

        mecanicJunior.setUrmator(mecanicSenior);
        mecanicSenior.setUrmator(sefService);
        sefService.setUrmator(reprezentanta);

        mecanicJunior.repartizeazaCererile(clientService);


    }
}
