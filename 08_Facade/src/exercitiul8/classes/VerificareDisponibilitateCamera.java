package exercitiul8.classes;

public class VerificareDisponibilitateCamera {

    private String tipCamera;
    private int zileCazare;

    public VerificareDisponibilitateCamera(String tipCamera, int zileCazare) {
        this.tipCamera = tipCamera;
        this.zileCazare = zileCazare;
    }

  public  void verificaCamera(){
        System.out.println("S-a verficat disponibilitatea camerei!");

    }
}
