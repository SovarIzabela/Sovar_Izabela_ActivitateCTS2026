package exercitiul9.classes;

public class PlatformaVideo implements IPlatformaVideo{


    private int idUser;
    private String numeUser;
    private boolean areAbonamentActiv;
    private String tipContinut;

    public PlatformaVideo(int idUser, String numeUser, boolean areAbonamentActiv, String tipContinut) {
        this.idUser = idUser;
        this.numeUser = numeUser;
        this.areAbonamentActiv = areAbonamentActiv;
        this.tipContinut = tipContinut;
    }


    public int getIdUser() {
        return idUser;
    }

    public String getNumeUser() {
        return numeUser;
    }

    public boolean isAreAbonamentActiv() {
        return areAbonamentActiv;
    }

    public String getTipContinut() {
        return tipContinut;
    }

    @Override
    public void vizioneazaVideo() {
        System.out.println("Userul " + numeUser + " vizioneaza continut " + tipContinut);
    }
}
