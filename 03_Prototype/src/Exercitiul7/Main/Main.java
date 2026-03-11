package Exercitiul7.Main;

import Exercitiul7.Classes.Document;
import Exercitiul7.Classes.IDocument;

public class Main {

    public static void main(String[] args){

        IDocument document1= new Document("Document1", "Probeleme Economie" , "Popescu");
        IDocument document2 = document1.clone();

        System.out.println(document1);
        System.out.println(document2);

        ((Document)document2).setTitlu("Document2");

        System.out.println(document1);
        System.out.println(document2);


    }


}
