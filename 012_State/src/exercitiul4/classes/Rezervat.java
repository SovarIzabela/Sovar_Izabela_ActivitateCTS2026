package exercitiul4.classes;

public class Rezervat implements IStare{
    @Override
    public void rezerva(OcupareLoc loc) {
        System.out.println("Locul este deja rezervat!");
    }

    @Override
    public void ocupa(OcupareLoc loc) {
        System.out.println("Locul a trecut in stare ocupat!");
        loc.setStare(new Ocupat());
    }

    @Override
    public void elibereaza(OcupareLoc loc) {
        System.out.println("Locul rezervar se elibereaza!");
        loc.setStare(new Liber());
    }
}
