package exercitiul3.module;

public class Card {

    private String numeBanca;
    private String sucursala;
    private String numarCont;
    private float suma;


    public Card(String numeBanca, String sucursala, String numarCont, float suma) {
        this.numeBanca = numeBanca;
        this.sucursala = sucursala;
        this.numarCont = numarCont;
        this.suma = suma;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("numeBanca='").append(numeBanca).append('\'');
        sb.append(", sucursala='").append(sucursala).append('\'');
        sb.append(", numarCont='").append(numarCont).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
