package exercitiul3.classes;

public class Rezervata implements State{
    @Override
    public void doAction(Masa masa) {
        System.out.println("Masa cu numarul " + masa.getNrMasa() + "a trecut in stare Rezervata!");
        masa.setState(this);
    }
}
