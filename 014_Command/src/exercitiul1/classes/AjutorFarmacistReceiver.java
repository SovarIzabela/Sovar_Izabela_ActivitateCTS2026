package exercitiul1.classes;

public class AjutorFarmacistReceiver implements AjutorFarmacie{




    @Override
    public void aduMedicament(String medicament) {
        System.out.println("Se aduce medicamentul " + medicament);
    }
}
