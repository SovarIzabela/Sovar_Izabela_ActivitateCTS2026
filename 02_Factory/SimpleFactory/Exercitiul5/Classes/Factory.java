package Exercitiul5.Classes;

public class Factory {

    public IMijlocTransport creeazaMijlocTransport(TipTransport tipTransport, String firma, String model, String anProductie, int nrLocuri, boolean esteElectric) throws Exception {

        switch (tipTransport){

            case tramvai : return new Tramvai(firma, model, anProductie, nrLocuri, esteElectric);
            case troleibuz: return new Troleibuz(firma, model, anProductie, nrLocuri, esteElectric);
            case autobuz: return new Autobuz(firma, model, anProductie, nrLocuri, esteElectric);
            default:throw new Exception("Nu este un tip valid de Mijloc de transport");


        }



    }

}
