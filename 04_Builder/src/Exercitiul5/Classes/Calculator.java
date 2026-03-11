package Exercitiul5.Classes;

public class Calculator {

    private String procesor;
    private int ram;
    private int ssd;
    private boolean placaVideo;

    public Calculator(String procesor, int ram, int ssd, boolean placaVideo) {
        this.procesor = procesor;
        this.ram = ram;
        this.ssd = ssd;
        this.placaVideo = placaVideo;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPlacaVideo(boolean placaVideo) {
        this.placaVideo = placaVideo;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calculator{");
        sb.append("procesor='").append(procesor).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append(", placaVideo=").append(placaVideo);
        sb.append('}');
        return sb.toString();
    }
}
