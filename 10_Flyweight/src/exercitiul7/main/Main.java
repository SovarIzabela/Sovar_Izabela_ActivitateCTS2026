package exercitiul7.main;

import exercitiul7.classes.FlyweightCopac;
import exercitiul7.classes.Icopac;
import exercitiul7.classes.OptionaleCopac;

public class Main {


    public static void main(String[] args){

        OptionaleCopac op1 = new OptionaleCopac(10,15);
        OptionaleCopac op2 = new OptionaleCopac(10,15);
        OptionaleCopac op3 = new OptionaleCopac(10,15);

        FlyweightCopac fc = new FlyweightCopac();
        Icopac icopac = fc.getCopac("stejar", true);
        icopac.deseneazaCopac(op1);
        icopac.deseneazaCopac(op2);
        icopac.deseneazaCopac(op3);
        Icopac icopac2 = fc.getCopac("stejar", false);
        System.out.println("Se afiseaza acelasi obiect");
        icopac2.deseneazaCopac(op1);
        icopac2.deseneazaCopac(op2);
        icopac2.deseneazaCopac(op3);

        System.out.println("Se afiseaza un alt obiect");

        Icopac icopac3 = fc.getCopac("fag", true);
        icopac3.deseneazaCopac(op1);
        icopac3.deseneazaCopac(op2);
        icopac3.deseneazaCopac(op3);


    }
}
