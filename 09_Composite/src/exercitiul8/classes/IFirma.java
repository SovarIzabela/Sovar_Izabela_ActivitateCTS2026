package exercitiul8.classes;

public interface IFirma {


    void adaugaNod(IFirma firma);
    void stergeNod(IFirma firma);
    IFirma getNod(int index);
    void descriere(String indent);


}
