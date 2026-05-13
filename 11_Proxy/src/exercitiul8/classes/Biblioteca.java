package exercitiul8.classes;

public class Biblioteca implements IBiblioteca{

    private String numeBiblioteca;

    public Biblioteca(String numeBiblioteca) {
        this.numeBiblioteca = numeBiblioteca;
    }

    @Override
    public void imprumutaCarti(Utilizator utilizator) {
        System.out.println(utilizator.getNumeUtilizator() + " a imprumutat carti!");
    }
}
