package exercitiul3.main;

import exercitiul3.classes.*;

public class Main {


    public static void main(String[] args){

        Calator calator = new Calator("calator1", 25, 12);

        Anotificator metrou= new Metrou();
        Anotificator tramvai = new Tramvai();
        Anotificator troleibuz = new Troleibuz();

        troleibuz.setAnotificator(tramvai);
        tramvai.setAnotificator(metrou);

        troleibuz.recomandaTransport(calator);





    }





}
