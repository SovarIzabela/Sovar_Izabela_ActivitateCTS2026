package exercitiul5.classes;

public interface IFlotaAutobuz {

    void adaugaNod(IFlotaAutobuz flotaAutobuz);
    void stergeNod(IFlotaAutobuz flotaAutobuz);
    IFlotaAutobuz getNod(int index);
    void descriere(String indent);


}
