package exercitiul9.classes;

public class Proxy implements IPlatformaVideo{


    private PlatformaVideo platformaVideo;

    public Proxy(PlatformaVideo platformaVideo) {
        this.platformaVideo = platformaVideo;
    }

    @Override
    public void vizioneazaVideo() {

        if(platformaVideo.isAreAbonamentActiv()){
            platformaVideo.vizioneazaVideo();
        }else{

            System.out.println("Userul nu are abonament activ  si nu poate viziona contint premium");
        }



    }
}
