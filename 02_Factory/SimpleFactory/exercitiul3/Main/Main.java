package exercitiul3.Main;

import exercitiul3.Classes.Factory;
import exercitiul3.Classes.ICredit;
import exercitiul3.Classes.TipCredite;

public class Main {


    public static void main(String[] args) throws Exception {
        Factory f1 = new Factory();
        ICredit credit1 = f1.intoarceCredit(TipCredite.IPOTECAR, 100000, 50, "Popescu", 1000, 0.05);
        ICredit credit2 = f1.intoarceCredit(TipCredite.NEVOIPERSONALE, 100000, 50, "Popescu", 1000, 0.05);


        System.out.println(credit1);
        credit2.descriere();
        System.out.println(credit2);
        credit1.descriere();

    }


}
