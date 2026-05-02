package exercitiul2.classes;

public class MementoMeci {

    private String dataMeciului;
    private String echipa1;
    private String echipa2;
    private int nrBileteVandute;
    private int nrBauturiVandute;


    public MementoMeci(String dataMeciului, String echipa1, String echipa2, int nrBileteVandute, int nrBauturiVandute) {
        this.dataMeciului = dataMeciului;
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
        this.nrBileteVandute = nrBileteVandute;
        this.nrBauturiVandute = nrBauturiVandute;
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

    @Override
    public String toString() {
        return "MementoMeci{" +
                "dataMeciului='" + dataMeciului + '\'' +
                ", echipa1='" + echipa1 + '\'' +
                ", echipa2='" + echipa2 + '\'' +
                ", nrBileteVandute=" + nrBileteVandute +
                ", nrBauturiVandute=" + nrBauturiVandute +
                '}';
    }
}
