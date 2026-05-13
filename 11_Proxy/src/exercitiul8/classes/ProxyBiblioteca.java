package exercitiul8.classes;

public class ProxyBiblioteca implements IBiblioteca{

    private Biblioteca biblioteca;

    public ProxyBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void imprumutaCarti(Utilizator utilizator) {
        if(utilizator.isAreAbonament()){
            biblioteca.imprumutaCarti(utilizator);
        }else {
            System.out.println("Utilizatorul nu are abonament si nu poate imprumuta carti!");
        }
    }
}
