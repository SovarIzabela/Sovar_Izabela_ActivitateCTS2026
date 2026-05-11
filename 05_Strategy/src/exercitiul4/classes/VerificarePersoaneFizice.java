package exercitiul4.classes;

public class VerificarePersoaneFizice implements IverificareActe {
    @Override
    public void verificaActe(String numeClient) {
        System.out.println(" Persoana fizica : S-au verificat buletinul și adeverință de la munca!");
    }
}
