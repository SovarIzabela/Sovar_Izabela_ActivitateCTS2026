package exercitiul1.Classes;

public class Facade {






    public boolean verificaMasa(int numarMasaLibera, int numarLocuriMasaLibera, int numarMasaDebarasata,
                                int numarLocuriMasaDebarasata, int numarMasaCuServetele,
                                int numarLocuriMasaCuSeretele,
                                int masaVerificata){


        AreMasaLibera masaLibera= new AreMasaLibera( numarMasaLibera, numarLocuriMasaLibera);
        AfostDebarasata masaDebarasata = new AfostDebarasata(numarMasaDebarasata, numarLocuriMasaDebarasata);
        AreServetele areServetele = new AreServetele(numarMasaCuServetele, numarLocuriMasaCuSeretele);

        return masaLibera.areMasaLibera(masaVerificata)&&masaDebarasata.aFostDebarasata(masaVerificata)&&areServetele.areServetele(masaVerificata);


    }



}
