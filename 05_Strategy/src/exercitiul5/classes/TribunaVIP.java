package exercitiul5.classes;

public class TribunaVIP implements IverificareSpectator{
    @Override
    public void verificareSpectator() {
        System.out.println("S-a efectuat verificarea de bilet pentru TribunaVIP");
    }
}
