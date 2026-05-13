package exercitiul6.main;

import exercitiul6.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        IPersonal personal = new Personal();
        ICommand c1 = new CurataCamera(personal);
        ICommand c2 = new PregatireMicDejun(personal);
        ICommand c3 = new ReparareDefectiune(personal);


        List<ICommand> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);



        Operator receptioner = new Operator(lista);
        receptioner.lanseazaComanda();



    }




}
