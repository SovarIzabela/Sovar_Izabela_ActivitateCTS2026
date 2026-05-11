package exercitiul5.classes;

public class Tribuna implements IverificareSpectator{
    @Override
    public void verificareSpectator() {
        System.out.println("S-a efectuat verificarea de bagaje pentru Tribuna");
    }
}
