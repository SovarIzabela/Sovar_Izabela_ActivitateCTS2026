package exercitiul3.classes;

public class Libera implements State{
    @Override
    public void doAction(Masa masa) {
        System.out.println("Masa cu numarul " + masa.getNrMasa()+ "a trecut in stare Libera!");
        masa.setState(this);
    }
}
