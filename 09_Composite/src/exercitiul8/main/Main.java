package exercitiul8.main;

import exercitiul8.classes.DepartamentComposite;
import exercitiul8.classes.Frunza;
import exercitiul8.classes.IFirma;

public class Main {

    public static void main(String[] args){

        IFirma anagajat1= new Frunza("Angajat 1 ");
        IFirma anagajat2 = new Frunza("Angajat 2 ");
        IFirma anagajat3 = new Frunza("Angajat 3 ");
        IFirma anagajat4 = new Frunza("Angajat 4 ");
        IFirma anagajat5 = new Frunza("Angajat 5 ");

        IFirma departamentIT = new DepartamentComposite("IT");
        IFirma departamentSup = new DepartamentComposite("Support");
        IFirma infra = new DepartamentComposite("infra");
        IFirma depDezvoltare = new DepartamentComposite("DEV");

        departamentIT.adaugaNod(departamentSup);
        departamentIT.adaugaNod(infra);
        departamentIT.adaugaNod(depDezvoltare);


        departamentSup.adaugaNod(anagajat2);
        departamentSup.adaugaNod(anagajat1);

        infra.adaugaNod(anagajat3);
        depDezvoltare.adaugaNod(anagajat4);
        depDezvoltare.adaugaNod(anagajat5);


        departamentIT.descriere(" ");



    }



}
