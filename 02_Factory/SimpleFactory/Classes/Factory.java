package Classes;

public class Factory {

    public Supa intoarceSupa(TipSupa tip, String ingrediente, float pret, int calorii ) throws Exception {

        switch(tip){
            case CIUPERCI: return new SupaCiuperci(ingrediente, pret, calorii);
            case VITA: return new SupaVita(ingrediente, pret, calorii);
            case LEGUME: return new SupaLegume(ingrediente, pret, calorii);
            default: throw new Exception("Nu reperzinta o supa valida!");

        }
    }






}
