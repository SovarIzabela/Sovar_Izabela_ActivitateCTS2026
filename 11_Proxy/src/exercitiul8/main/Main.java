package exercitiul8.main;

import exercitiul8.classes.Biblioteca;
import exercitiul8.classes.IBiblioteca;
import exercitiul8.classes.ProxyBiblioteca;
import exercitiul8.classes.Utilizator;

public class Main {

    public static void main(String[] args){

        Utilizator u1 = new Utilizator("Utilizator 1 " , true);
        Utilizator u2 = new Utilizator("Utilizator 2 " , false);

        IBiblioteca biblioteca = new Biblioteca("Biblioteca 1");
        biblioteca.imprumutaCarti(u2);

        IBiblioteca proxy = new ProxyBiblioteca((Biblioteca) biblioteca);
        proxy.imprumutaCarti(u2);

    }


}
