package exercitiul8.main;

import exercitiul8.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        IPersonalMedical  personalMedical = new PersonalMedical("Pacient 1", "orl");

        ICommand command = new AnulareConsultatie(personalMedical);
        ICommand command1 = new EmiteReteta(personalMedical);
        ICommand comanda2 = new ProgramareConsultatie(personalMedical);

        List<ICommand> lista = new ArrayList<>();
        lista.add(command);
        lista.add(command1);
        lista.add(comanda2);


        Receptioner receptioner = new Receptioner(lista);
        receptioner.lanseazaComanda();




    }
}
