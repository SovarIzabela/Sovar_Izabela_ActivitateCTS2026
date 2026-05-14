package exercitiul9.classes;

public class BiletDecorat extends ABilet{
    public BiletDecorat(IBilet bilet) {
        super(bilet);
    }


    @Override
    public void tiparesteBilet(int idBilet) {
        super.tiparesteBilet(idBilet);
        System.out.println("Vizionare Placuta!");
    }
}
