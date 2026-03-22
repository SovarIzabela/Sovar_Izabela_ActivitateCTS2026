package exercitiul1.main;

import exercitiul1.Classes.*;

public class Main {

    public static void main(String[] args){

        IsoftExistent softExistent = new SoftExistent(125, 350.0f);
        softExistent.printeazaFactura();

        IsoftNouBar softNouBar = new SoftNouBar("bere", 5, 2);
        softNouBar.emiteNota();

        System.out.println("Adaptat");
        IsoftExistent softAdaptat = new Adapter(softNouBar);
        softAdaptat.printeazaFactura();



    }

}
