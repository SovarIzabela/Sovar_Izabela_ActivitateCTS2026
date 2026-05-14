package exercitiul9.classes;

public interface IUniversitate {

    void adaugaNod(IUniversitate universitate);
    void stergeNod(IUniversitate universitate);
    IUniversitate getNod(int index);
    void descriere(String indent);


}
