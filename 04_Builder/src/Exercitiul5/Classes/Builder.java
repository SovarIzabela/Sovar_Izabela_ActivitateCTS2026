package Exercitiul5.Classes;

public class Builder implements IBuilder{

    private Calculator calculator;

    public Builder() {
        this.calculator = new Calculator("N/A", 0, 0,false);

    }

    public Builder setProcesor(String procesor) {
        this.calculator.setProcesor(procesor);
        return this;
    }

    public Builder setRam(int ram) {
        this.calculator.setRam(ram);
        return this;
    }

    public Builder setPlacaVideo(boolean placaVideo) {
        this.calculator.setPlacaVideo(placaVideo);
        return this;
    }

    public Builder setSsd(int ssd) {
        this.calculator.setSsd(ssd);
        return this;
    }


    @Override
    public Calculator build() {
        return calculator;
    }
}
