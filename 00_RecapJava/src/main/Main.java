package main;

import classes.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {



        Magazin m1= new MagazinAlimentar("Magazin1" , 50, "Bd-ul Timisoara", false);
        Magazin m2= new MagazinBauturi("Magazin2" , 20, "Bd-ul Stefan cel Mare", TipBautura.LOCALA);
        Magazin m3= new MagazinBricolaj("Magazin3" , 40, "Bd-ul Victoria", false);

        m1.afiseazaMagazin();
        m2.afiseazaMagazin();
        m3.afiseazaMagazin();

        System.out.println(m1.getDenumireMagazin());

        System.out.println("-----------ARRAY---------");

        Magazin[] arrayMagazin = new Magazin[3];
        arrayMagazin[0] = m1;
        arrayMagazin[1]=m2;
        arrayMagazin[2]=m3;

        for(Magazin m : arrayMagazin){
            m.afiseazaMagazin();
            System.out.println("-------------");
        }

        System.out.println("--------ToString------");

        System.out.println(Arrays.toString(arrayMagazin));
        System.out.println("Denumirea Magazin 1 " + arrayMagazin[0].getDenumireMagazin());

        System.out.println("--------List-----");
        List<Magazin> lista = new ArrayList<Magazin>();
        lista.add(m1);
        lista.add(m2);
        lista.add(m3);

        for (Magazin m: lista){
            m.afiseazaMagazin();
        }

        lista.remove(m3);

        System.out.println(lista);
        System.out.println("NR angajati "+lista.get(0).getNrAngajati());


        System.out.println("-------------MAP----------");
        Map<String, Magazin> mapMagazin = new HashMap<String, Magazin>();
        mapMagazin.put("Magazin1" , m1);
        mapMagazin.put("Magazin2" , m2);
        mapMagazin.put("Magazin3" , m3);

        for(Map.Entry<String, Magazin> m : mapMagazin.entrySet()){
            System.out.println(m);
        }

        if(!mapMagazin.containsKey("Magazin1")){
            mapMagazin.put("Magazin1" , m1);
        }

        System.out.println("Angajati ai magazinului 1 " + mapMagazin.get("Magazin1").getNrAngajati());

        for(String m: mapMagazin.keySet()){
            System.out.println(mapMagazin.get(m));
        }


    }



}
