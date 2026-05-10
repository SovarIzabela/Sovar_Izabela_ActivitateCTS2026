package exercitiul7.classes;

public interface IProduse {

    void adaugaNod(IProduse produse);
    void stergeNod(IProduse produse);
    IProduse getProdus(int index);
    void descriere(String indent);



}
