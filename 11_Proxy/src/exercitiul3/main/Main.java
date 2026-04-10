package exercitiul3.main;

import exercitiul3.classes.Credit;
import exercitiul3.classes.ProxyCredit;

public class Main {
    public static void main(String [] args){

        Credit credit = new Credit("Popescu Isa", 20000, "RON");
        Credit credit3 = new Credit("Popescu Vasile", 20000, "EURO");
        ProxyCredit credit1 = new ProxyCredit(credit);
        ProxyCredit credit2 = new ProxyCredit(credit3);
        credit1.acordaCredit();
        credit2.acordaCredit();



    }
}
