package Main;

import Classes.*;

public class Main {


    public static void main(String[] args) throws Exception {

        Factory f1 = new Factory();


        Supa s1 = f1.intoarceSupa(TipSupa.CIUPERCI, "Ciuperci", 50, 200);
        Supa s2 = f1.intoarceSupa(TipSupa.VITA, "Vita", 50, 300);
        Supa s3 = f1.intoarceSupa(TipSupa.LEGUME, "Legume", 50, 100);

        s1.descriere();
        s2.descriere();
        s3.descriere();


    }
}
