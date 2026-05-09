package exercitiul7.main;

import exercitiul7.classes.*;

public class Main {
    public static void main(String[] args){

        ImedicamentFarmacie imedicamentFarmacie = new MedicamentFarmacie("Farmacie1", "Nurofen", 30);
        imedicamentFarmacie.cumparaMedicament();


        ImedicamentSpital imedicamentSpital = new MedicamentSpital(true, 15, "Antibiotic1");
        imedicamentSpital.achizitioneazaMedicament();
        System.out.println("--------Soft Adaptat--------------------");
        ImedicamentFarmacie medicamentAdaptat = new Adapter(imedicamentSpital);
        medicamentAdaptat.cumparaMedicament();


    }


}
