package exercitiul8.classes;

public class Facade {


    public void realizeazaCheckIN(String numeClient, int varsta, String cnp, int numarCamera, String tipCamera, int zileCazare ){

        VerificareCI verificareCI = new VerificareCI(numeClient, varsta, cnp);
        verificareCI.verificareBuletin();

        VerificareDisponibilitateCamera disponibilitateCamera = new VerificareDisponibilitateCamera(tipCamera, zileCazare);

        disponibilitateCamera.verificaCamera();

        VerificareRezervare rezervare = new VerificareRezervare(numarCamera);
        rezervare.verificaRezervare(numeClient);


    }



}
