package exercitiul3.classes;

public class Troleibuz extends Anotificator{




    @Override
    public void recomandaTransport(Calator calator) {

        if(calator.getDistanta()<=3){
            System.out.println("Se recomanda Troleibuzul");
        }
        else{

            super.getAnotificator().recomandaTransport(calator);
        }



    }
}
