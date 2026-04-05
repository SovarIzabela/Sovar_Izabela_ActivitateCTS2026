package exercitiul3.classes;

public class AreVarsta {

    private String numeClient;
    private int varstaClient;

    public AreVarsta(String numeClient, int varstaClient) {
        this.numeClient = numeClient;
        this.varstaClient = varstaClient;
    }

    public boolean areVarsta(){
        if(varstaClient>=18){
            return true;
        }else{
            return false;
        }


    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AreVarsta{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", varstaClient=").append(varstaClient);
        sb.append('}');
        return sb.toString();
    }
}
