package exercitiul3.main;

import exercitiul3.module.AgentieComposite;
import exercitiul3.module.FilialaFrunza;
import exercitiul3.module.ISucursala;

public class Main {

    public static void main(String [] args) throws Exception {
        ISucursala agentie1 = new AgentieComposite("Bucuresti");
        ISucursala filiala1 = new FilialaFrunza("Titan");
        ISucursala filiala2 = new FilialaFrunza("Militari");
        ISucursala filiala3 = new FilialaFrunza("DrumulTaberelor");
        agentie1.adaugaNod(filiala1);
        agentie1.adaugaNod(filiala2);
        agentie1.adaugaNod(filiala3);

        ISucursala agentie2 = new AgentieComposite("Pitesti");
        ISucursala filiala4 = new FilialaFrunza("Gavana");
        ISucursala filiala5 = new FilialaFrunza("Bradu");
        ISucursala filiala6 = new FilialaFrunza("Exercitiu");
        agentie2.adaugaNod(filiala4);
        agentie2.adaugaNod(filiala5);
        agentie2.adaugaNod(filiala6);



        agentie1.descriere(" ");
        agentie2.descriere(" ");





    }
}
