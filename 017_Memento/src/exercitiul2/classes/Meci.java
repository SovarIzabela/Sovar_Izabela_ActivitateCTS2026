package exercitiul2.classes;

public class Meci {

    private String dataMeciului;
    private String echipa1;
    private String echipa2;
    private int nrBileteVandute;
    private int nrBauturiVandute;
    private int numarJandarmi;
    private int numarStewardezi;


    public Meci(String dataMeciului, String echipa1, int nrBileteVandute, String echipa2, int nrBauturiVandute, int numarJandarmi, int numarStewardezi) {
        this.dataMeciului = dataMeciului;
        this.echipa1 = echipa1;
        this.nrBileteVandute = nrBileteVandute;
        this.echipa2 = echipa2;
        this.nrBauturiVandute = nrBauturiVandute;
        this.numarJandarmi = numarJandarmi;
        this.numarStewardezi = numarStewardezi;
    }

    public String getDataMeciului() {
        return dataMeciului;
    }

    public void setDataMeciului(String dataMeciului) {
        this.dataMeciului = dataMeciului;
    }

    public String getEchipa1() {
        return echipa1;
    }

    public void setEchipa1(String echipa1) {
        this.echipa1 = echipa1;
    }

    public String getEchipa2() {
        return echipa2;
    }

    public void setEchipa2(String echipa2) {
        this.echipa2 = echipa2;
    }

    public int getNrBileteVandute() {
        return nrBileteVandute;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public int getNrBauturiVandute() {
        return nrBauturiVandute;
    }

    public void setNrBauturiVandute(int nrBauturiVandute) {
        this.nrBauturiVandute = nrBauturiVandute;
    }


    public MementoMeci salveazaMemento(){
        return new MementoMeci(this.dataMeciului, this.echipa1, this.echipa2, this.nrBileteVandute, this.nrBauturiVandute);


    }

    public void revenire(MementoMeci mementoMeci){
        this.dataMeciului = mementoMeci.getDataMeciului();
        this.echipa1 = mementoMeci.getEchipa1();
        this.echipa2 = mementoMeci.getEchipa2();
        this.nrBileteVandute = mementoMeci.getNrBileteVandute();
    }

    @Override
    public String toString() {
        return "Meci{" +
                "dataMeciului='" + dataMeciului + '\'' +
                ", echipa1='" + echipa1 + '\'' +
                ", echipa2='" + echipa2 + '\'' +
                ", nrBileteVandute=" + nrBileteVandute +
                ", nrBauturiVandute=" + nrBauturiVandute +
                ", numarJandarmi=" + numarJandarmi +
                ", numarStewardezi=" + numarStewardezi +
                '}';
    }
}
