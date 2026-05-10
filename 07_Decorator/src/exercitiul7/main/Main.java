package exercitiul7.main;

import exercitiul7.classes.Adecorator;
import exercitiul7.classes.Decorator;
import exercitiul7.classes.Factura;
import exercitiul7.classes.Ifactura;

public class Main {

    public static void main(String[] args){

        System.out.println("--------Factura normala!----------");


        Ifactura ifactura = new Factura("aBC127", 500.7f, "02.05.2026");
        ifactura.emiteFactura();
        System.out.println("---------Factura decorata!----------------");
        Adecorator facturaDecorata = new Decorator(ifactura);
        facturaDecorata.emiteFactura();

    }


}
