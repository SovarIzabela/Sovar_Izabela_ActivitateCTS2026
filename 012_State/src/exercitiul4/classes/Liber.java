package exercitiul4.classes;

public class Liber implements IStare{
    @Override
    public void rezerva(OcupareLoc loc) {
        System.out.println("Locul este liber si se poate rezerva");
        loc.setStare(new Rezervat());
    }

    @Override
    public void ocupa(OcupareLoc loc) {
        System.out.println("Locul este liber si se poate ocupa");
        loc.setStare(new Ocupat());
    }

    @Override
    public void elibereaza(OcupareLoc loc) {
        System.out.println("Locul este liber deja!");

    }
}
