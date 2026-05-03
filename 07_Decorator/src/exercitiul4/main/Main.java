package exercitiul4.main;

import exercitiul4.classes.*;

public class Main {

    public static void main(String[] args){


        Icertificat icertificat =new Certificat("a0145", "Absolvent1", "mai2026");

        icertificat = new BadgeExcelenta(icertificat);
        icertificat = new SemanturaDigitala(icertificat);
        icertificat  = new MesajPersonalizat(icertificat);

        icertificat.emiteCertificat();


    }

}
