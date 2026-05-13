package exercitiul6.main;

import exercitiul6.classes.Biblioteca;
import exercitiul6.classes.Cititor;
import exercitiul6.classes.IBiblioteca;
import exercitiul6.classes.Iobserver;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Iobserver o1 = new Cititor(101, "Cititor1");
        Iobserver o2 = new Cititor(101, "Cititor2");
        Iobserver o3 = new Cititor(101, "Cititor3");

        List<Iobserver> listaCititori = new ArrayList<>();
        listaCititori.add(o1);
        listaCititori.add(o2);
        listaCititori.add(o3);

        Biblioteca biblioteca = new Biblioteca("Biblioteca 1 ", listaCititori);
        biblioteca.notificaCarteNoua();





    }


}
