package AbstractFactory.main;

import AbstractFactory.classes.FactoryCategoria1;
import AbstractFactory.classes.IFactory;
import AbstractFactory.classes.IPachetCazare;
import AbstractFactory.classes.IPachetTransport;

public class Main {


    public static void main(String[] args){

        IFactory factory = new FactoryCategoria1();
        IPachetTransport cazare= factory.creazaPachetTransport();
        cazare.descriere();

        IPachetCazare cazare2= factory.creazaPachetCazare();
        cazare2.descriere();




    }



}
