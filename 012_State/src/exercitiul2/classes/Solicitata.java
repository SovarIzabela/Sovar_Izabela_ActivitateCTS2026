package exercitiul2.classes;

public class Solicitata  implements Istare{
    @Override
    public void doAction(Reteta reteta) {
        System.out.println("Reteta cu id-ul " + reteta.getNumarReteta() + " a trecut in starea Solicitata") ;
        reteta.setStare(this);
    }
}
