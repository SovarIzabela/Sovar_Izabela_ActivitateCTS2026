package exercitiul2.main;

import exercitiul2.classes.*;

public class Main {
    public static void main(String[] args){
        ContBancar contBancar = new ContBancar("persoana 1 " , " ING", 200.0F);
        Icomand constituire = new Constituire(contBancar,100.0f);
        Icomand depunere = new Depunere(contBancar, 200.0F);
        Icomand retragere = new Retragere(contBancar, 50.0f);


        Operator operator = new Operator();
        operator.lanseazaComanda(constituire);
        operator.lanseazaComanda(depunere);
        operator.lanseazaComanda(retragere);

    }
}
