package Exercitiul6.Classes;

public class FactoryPlata {

    public Plata crearePlata(TipPlata tip,float sumaPlatita, float soldFinal) throws Exception {
        switch (tip){

            case card : return new Card( sumaPlatita, soldFinal);
            case cash: return new Cash( sumaPlatita, soldFinal);
            case paypall:return new PayPall( sumaPlatita, soldFinal);
            default:throw new Exception("Nu este o modalitate de plata valida");

        }

    }


}
