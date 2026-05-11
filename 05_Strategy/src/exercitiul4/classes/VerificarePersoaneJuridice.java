package exercitiul4.classes;

public class VerificarePersoaneJuridice implements IverificareActe{
    @Override
    public void verificaActe(String numeClient) {
        System.out.println("Persoana juridica : S-au verificat actele de înființare a firmei precum si dovada înregistrării la Registrul comerțului.");
    }
}
