package exercitiul6.classes;



public class STBexistent implements Istb{
    private String numarLinie;
    private String tipTransport;
    private boolean areAc;


    public STBexistent(String numarLinie, String tipTransport, boolean areAc) {
        this.numarLinie = numarLinie;
        this.tipTransport = tipTransport;
        this.areAc = areAc;
    }

    @Override
    public void valideazaCalatorieSTB() {
        System.out.println("S-a validat o calatorie STB");
    }

    @Override
    public String toString() {
        return "STBexistent{" +
                "numarLinie='" + numarLinie + '\'' +
                ", tipTransport='" + tipTransport + '\'' +
                ", areAc=" + areAc +
                '}';
    }
}
