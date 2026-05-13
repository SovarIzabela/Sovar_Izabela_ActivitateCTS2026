package exercitiul3.classes;

public class Tramvai extends Anotificator{


    @Override
    public void recomandaTransport(Calator calator) {
        if(calator.getDistanta()>=3&&calator.getDistanta()<=5){
            System.out.println("Se recomanda Tramvaiul");
        }
        else{

            super.getAnotificator().recomandaTransport(calator);
        }



    }
}
