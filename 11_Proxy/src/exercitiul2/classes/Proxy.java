package exercitiul2.classes;

public class Proxy implements IvanzareMedicament {

   private VanzareMedicament vanzareMedicament;

    public Proxy(VanzareMedicament vanzareMedicament) {
        this.vanzareMedicament = vanzareMedicament;
    }

    @Override
    public void vindeMedicament() {
        if(vanzareMedicament.isAreReteta()){
            System.out.println("S-a vandut medicament pentru clientul ->  " + vanzareMedicament.getNumeClient());
        }else{
            System.out.println("Nu se pot vinde medicamente fara reteta!");
        }
    }
}
