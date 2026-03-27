package exercitiul2.Classes;

public class VerificareReteta {

    private int idClient;

    public VerificareReteta(int idClient) {
        this.idClient = idClient;
    }

    public boolean verificaReteta(){
        return true;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VerificareReteta{");
        sb.append("idClient='").append(idClient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
