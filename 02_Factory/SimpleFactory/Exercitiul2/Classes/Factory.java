package Exercitiul2.Classes;

public class Factory {

    public AMedicament returneazaMedicament(TipMedicament tip,String denumire, float pret ) throws Exception {
        switch(tip){


            case BODY : return new Body(denumire, pret);
            case DURERE: return new Durere(denumire, pret);
            case RACEALA: return new Raceala(denumire,pret);
            default: throw new Exception("Nu reprezinta un medicament valid!");
        }




    }


}
