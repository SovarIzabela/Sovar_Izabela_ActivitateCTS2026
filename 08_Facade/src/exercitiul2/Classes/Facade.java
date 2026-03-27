package exercitiul2.Classes;

public class Facade {

    public boolean vindeMedicament(String numePacient, int idCard, String numeMedicament, int stocDepozit,int idClient){

        VerificareCardSanatate verificareCardSanatate = new VerificareCardSanatate(numePacient, idCard);

        VerificareDisponibilitateDepozit verificareDisponibilitateDepozit = new VerificareDisponibilitateDepozit( numeMedicament,  stocDepozit);

        VerificareReteta verificareReteta = new VerificareReteta(idClient);

        if(verificareCardSanatate.areCardSanatate()&& verificareDisponibilitateDepozit.areStoc()
        && verificareReteta.verificaReteta()){
            return true;
        }else{
            return false;
        }


    }







}
