package exercitiul7.classes;

public class LivrareStandard implements ILivrare{
    @Override
    public void livrareComanda(String numarComanda) {
        System.out.println("Comanda " + numarComanda + "este cu Livrare standard!");
    }
}
