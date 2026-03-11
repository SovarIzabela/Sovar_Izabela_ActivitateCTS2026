package FactoryMethod.Exercitiul6.Main;



import FactoryMethod.Exercitiul6.Classes.*;

public class Main {

    public static void main(String[] args) {

        IFactory factoryContCurent= new FContCurent();
        IFactory factoryContEconomii = new FContEconomii();
        IFactory factoryContPremium = new FContPremium();

        ContBancar cont1= factoryContCurent.creareCont("Sovar Izabela", 1000);
        ContBancar cont2 = factoryContEconomii.creareCont("Sovar Izabela", 2000);
        ContBancar cont3= factoryContPremium.creareCont("SovarIzabela", 100000);

        cont1.afisareDetalii();
        cont2.afisareDetalii();
        cont3.afisareDetalii();


    }


}
