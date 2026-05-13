package exercitiul8.classes;

public class VerificareRezervare {

    private int numarCamera;

    public VerificareRezervare(int numarCamera) {
        this.numarCamera = numarCamera;
    }


    public void verificaRezervare(String numeClient){
        System.out.println("S-a verificat rezervarea penru clientul " + numeClient  ) ;
    }


}
