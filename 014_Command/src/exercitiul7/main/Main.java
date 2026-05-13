package exercitiul7.main;

import exercitiul7.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Antrenor antrenor = new Antrenor();

        Icommand anulareProgramare = new AnulareProgramare(antrenor);
        Icommand programareEvaluare = new ProgramareEvaluareFizica(antrenor);
        Icommand creareAbonament = new CreareAbonament(antrenor);

        List<Icommand> lista = new ArrayList<>();
        lista.add(anulareProgramare);
        lista.add(programareEvaluare);
        lista.add(creareAbonament);

        Operator operator = new Operator(lista);
        operator.lanseazaComanda();


    }
}
