package exercitiul9.main;

import exercitiul9.classes.IPlatformaVideo;
import exercitiul9.classes.PlatformaVideo;
import exercitiul9.classes.Proxy;

public class Main {

    public static void main(String[] args){


        PlatformaVideo platformaVideo = new PlatformaVideo(100, "User1", false, "premium");
        platformaVideo.vizioneazaVideo();

        System.out.println("--------------------Proxy-------------");

        IPlatformaVideo proxy = new Proxy(platformaVideo);
        proxy.vizioneazaVideo();




    }



}
