package exercitiul4.main;


import exercitiul4.classes.ClientBanca;
import exercitiul4.classes.VerificarePersoaneJuridice;

public class Main {
    public static void main(String [] args){

        ClientBanca c1 = new ClientBanca("Client 1 ", "20.01.1986");
        c1.verificaActe();
        c1.setVerificareActe(new VerificarePersoaneJuridice());
        c1.verificaActe();

    }
}
