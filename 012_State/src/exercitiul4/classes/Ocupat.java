package exercitiul4.classes;

public class Ocupat implements IStare{
    @Override
    public void rezerva(OcupareLoc loc) {
        System.out.println("Locul este ocupat si nu poate fi rezervat momentan");
    }

    @Override
    public void ocupa(OcupareLoc loc) {
        System.out.println("Locul este deja ocupat!");
    }

    @Override
    public void elibereaza(OcupareLoc loc) {
        System.out.println("Locul ocupat se elibereaza!");
        loc.setStare(new Liber());
    }
}
