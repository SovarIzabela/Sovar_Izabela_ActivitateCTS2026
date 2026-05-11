package exercitiul4.classes;

public class ClientBanca {

    private String numeClient;
    private String dataNasterii;
    private IverificareActe verificareActe;

    public ClientBanca(String numeClient, String dataNasterii) {
        this.numeClient = numeClient;
        this.dataNasterii = dataNasterii;
        this.verificareActe = new VerificarePersoaneFizice();
    }

    public void setVerificareActe(IverificareActe verificareActe) {
        this.verificareActe = verificareActe;
    }

    public void verificaActe(){

        verificareActe.verificaActe(numeClient);
    }



}
