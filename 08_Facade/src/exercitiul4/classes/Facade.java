package exercitiul4.classes;

import java.util.List;

public class Facade {


    public void internarePacient(String numePacient, boolean areCardSanatate, int varsta, String afectiune,
                                 boolean necesitaInvestigatii, String numeMedic, String speciaizare ,
                                 String numeSpital, String sectie, List<Integer> paturiOcupate, List<Integer> paturiLibeere, int nrPat){

        Pacient pacient = new Pacient(numePacient, areCardSanatate, varsta, afectiune, necesitaInvestigatii);
        Medic medic = new Medic(numeMedic, speciaizare);
        Salon salon = new Salon(numeSpital, sectie, paturiOcupate, paturiLibeere);

         pacient.verificaGravitatea();
        medic.verificaInternare(pacient);
        salon.verificaPatLiber(nrPat);






    }





}
