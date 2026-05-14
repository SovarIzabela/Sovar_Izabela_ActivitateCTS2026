package exercitiul9.main;

import exercitiul9.classes.*;

public class Main {

    public static void main(String[] args){


        Client client = new Client("101");
        IModPlata card = new Card();
        IModPlata cash = new Cash();
        IModPlata voucher = new Voucher();

        client.plateste(100);
        client.setModPlata(voucher);
        client.plateste(200);


    }


}
