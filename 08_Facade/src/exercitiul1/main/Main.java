package exercitiul1.main;

import exercitiul1.Classes.Facade;

public class Main {
    public static void main(String[] args){

        Facade facade = new Facade();
        boolean rezultatVerificareMasa=  facade.verificaMasa(10,7,15,5,10,5,10);

        if(rezultatVerificareMasa){
            System.out.println("Masa este pregatita!");
        }else{
            System.out.println("Aceasta masa nu este inca pregatita !");
        }



    }
}
