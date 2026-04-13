package exercitiul4.Classes;

public class Factory {


    public ISportiv getSportiv(ETipSportiv eTipSportiv, String numeSportiv, String echipa, int numarTricou, int varsta, String liga) throws Exception {

        switch (eTipSportiv){

            case atacant : return new Atacant(numeSportiv,echipa, numarTricou,varsta, liga);
            case fundas: return new Fundas( numeSportiv, varsta,numarTricou, liga, echipa);
            case portar:return new Portar(numeSportiv,varsta,numarTricou, liga, echipa);
            default:throw new Exception("Nu este un jucator valid");
        }

    }


}
