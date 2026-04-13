package exercitiul4.Main;

import exercitiul4.Classes.AutobuzLinie;
import exercitiul4.Classes.Builder;
import exercitiul4.Classes.IBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        IBuilder builder = new Builder("CS100", "Matei Gigel");

        AutobuzLinie autobuzLinie1= ((Builder)builder).setAreOprireCapatLinie(true).setDeschideUsileAutomat(true).build();

        System.out.println(autobuzLinie1);

        List<String> lista = new ArrayList<>();
        lista.add("Urmeaza statia Frigocom");
        lista.add("Urmeaza statia Afi");

        AutobuzLinie autobuzLinie2 =((Builder)builder).setTestAfisareEcranDerulant(lista).build();
        System.out.println(autobuzLinie2);


    }

}
