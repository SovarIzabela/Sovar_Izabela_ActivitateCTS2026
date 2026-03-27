package exercitiul2.module;

public interface ISectiune {

    void adaugaNod(ISectiune sectiune) throws Exception;
    void getNod(int index) throws Exception;
    void stergenod(ISectiune sectiune) throws Exception;
    void descriere(String indent);
}
