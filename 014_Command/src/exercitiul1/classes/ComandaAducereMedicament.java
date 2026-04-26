package exercitiul1.classes;

public class ComandaAducereMedicament implements IComanda {

    private AjutorFarmacistReceiver farmacistReceiver;
    private String medicament;

    public ComandaAducereMedicament(AjutorFarmacistReceiver farmacistReceiver, String medicament) {
        this.farmacistReceiver = farmacistReceiver;
        this.medicament = medicament;
    }

    @Override
    public void executa() {
        farmacistReceiver.aduMedicament(medicament);
    }

    @Override
    public String toString() {
        return "ComandaAducereMedicament{" +
                "farmacistReceiver=" + farmacistReceiver +
                ", medicament='" + medicament + '\'' +
                '}';
    }
}
