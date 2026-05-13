package exercitiul7.main;

import exercitiul7.classes.Client;
import exercitiul7.classes.Iobserver;
import exercitiul7.classes.MagazinOnline;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Iobserver client1 = new Client("Client 1 ");
        Iobserver client2 = new Client("Client 2 ");
        Iobserver client3 = new Client("Client 3 ");
        Iobserver client4 = new Client("Client 4 ");

        List<Iobserver> lista = new ArrayList<>();
        lista.add(client1);
        lista.add(client2);
        lista.add(client3);
        lista.add(client4);

        MagazinOnline magazinOnline = new MagazinOnline("emag", lista);
        magazinOnline.notificaClient("Produsul a revenit in stoc");
        System.out.println("-------------------------------------------------");
        magazinOnline.dezabonareClient(client1);

        magazinOnline.notificaClient("Produsul a revenit in stoc");

    }
}
