package exercitiul7.classes;

public class RidicarePersonala implements ILivrare{
    @Override
    public void livrareComanda(String numarComanda) {
        System.out.println("Comanda " + numarComanda+ "este cu Ridicare Personala din magazin!");
    }
}
