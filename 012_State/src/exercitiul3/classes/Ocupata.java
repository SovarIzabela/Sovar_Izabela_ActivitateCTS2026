package exercitiul3.classes;

public class Ocupata implements State{
    @Override
    public void doAction(Masa masa) {
        System.out.println("Masa cu numarul " + masa.getNrMasa()+ "a trecut in stare Ocupata!");
        masa.setState(this);
    }
}
