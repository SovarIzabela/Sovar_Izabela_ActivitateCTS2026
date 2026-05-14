package exercitiul9.main;

import exercitiul9.classes.IObserver;
import exercitiul9.classes.IPlatformaCurs;
import exercitiul9.classes.PlatformaCurs;
import exercitiul9.classes.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){

        IObserver student1 = new Student("Matei Elena", 39, "standard" );
        IObserver student2 = new Student("Ionescu Catalina", 25, "premium" );
        IObserver student3 = new Student("Marin Ion", 45, "standard" );
        IObserver student4 = new Student("Vulpescu Corina", 27, "premium" );


        List<IObserver> lista = new ArrayList<>();
        lista.add(student1);
        lista.add(student2);
        lista.add(student3);
        lista.add(student4);

        IPlatformaCurs platformaCurs = new PlatformaCurs(lista);
        platformaCurs.notifica("A aparut un nou curs!");






    }


}
