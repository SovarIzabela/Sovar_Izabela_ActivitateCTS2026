package Exercitiul9.Main;

import Exercitiul9.Classes.ClientRezervare;
import Exercitiul9.Classes.IClientRezervare;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){


        List<String> lista = new ArrayList<>();
        lista.add("scaun ergonomic");

        IClientRezervare clientRezervare = new ClientRezervare("Client1", 2, 7,lista);

        IClientRezervare clientRezervare1 = clientRezervare.copiaza();
        System.out.println(clientRezervare1);
        System.out.println(clientRezervare);
    }
}
