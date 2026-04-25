package Exercitiul2.main;

import Exercitiul2.classes.ClientFarmacie;
import Exercitiul2.classes.Farmacie;
import Exercitiul2.classes.IFarmacie;
import Exercitiul2.classes.Iobserver;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){
        Iobserver c1 = new ClientFarmacie("Client 1" , 101, true);
        Iobserver c2 = new ClientFarmacie("Client 2" , 102, false);
        Iobserver c3 = new ClientFarmacie("Client 3" , 103, true);
        Iobserver c4 = new ClientFarmacie("Client 4" , 104, false);

        List<Iobserver> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);


        IFarmacie farmacie1 = new Farmacie("DrMax" ,lista);
        farmacie1.adaugClient(new ClientFarmacie("Client5", 105, true));
        farmacie1.adaugClient(new ClientFarmacie("Client6", 106, false));
        ((Farmacie)farmacie1).notificareOfertaPret();
        System.out.println("-----------------------");
        farmacie1.stergeClient(c1);
        ((Farmacie)farmacie1).notificareOfertaPret();
        System.out.println("-----------------------");
    }


}
