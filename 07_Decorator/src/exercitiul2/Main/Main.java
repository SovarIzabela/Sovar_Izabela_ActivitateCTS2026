package exercitiul2.Main;

import exercitiul2.Classes.Adecorator;
import exercitiul2.Classes.BonDeCasa;
import exercitiul2.Classes.BonDecorat;
import exercitiul2.Classes.Ibon;

public class Main {

    public static void main(String[] args){

        Ibon bon =  new BonDeCasa(101, 550.25f);
        bon.printeazaBon();

        Adecorator bonDecorat = new BonDecorat(bon);
        bonDecorat.printeazaFelicitare();
        bonDecorat.printeazaBon();

    }


}
