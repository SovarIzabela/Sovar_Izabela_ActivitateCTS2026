package exercitiul6.classes;

public interface IVirus {

    void adaugaNod(IVirus virus);
    void stergeNod(IVirus virus);
    void descriere(String indent);
    IVirus getVirus(int index);


}
