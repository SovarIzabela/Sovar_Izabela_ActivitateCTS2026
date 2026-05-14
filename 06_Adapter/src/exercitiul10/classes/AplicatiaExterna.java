package exercitiul10.classes;

public class AplicatiaExterna implements IAplicatieExterna{


    private String numeAudio;
    private String artist;
    private int numarRedari;
    private String playlist;


    public AplicatiaExterna(String numeAudio, String artist, int numarRedari, String playlist) {
        this.numeAudio = numeAudio;
        this.artist = artist;
        this.numarRedari = numarRedari;
        this.playlist = playlist;
    }

    @Override
    public void playAudio() {
        System.out.println("Se reda melodia"+ artist + " playlist: " + playlist);
    }

    @Override
    public String toString() {
        return "AplicatiaExterna{" +
                "numeAudio='" + numeAudio + '\'' +
                ", artist='" + artist + '\'' +
                ", numarRedari=" + numarRedari +
                ", playlist='" + playlist + '\'' +
                '}';
    }
}
