package exercitiul3.classes;

public class EsteUrmaritPolitie {

    private boolean esteUrmaritPolitie;

    public EsteUrmaritPolitie(boolean esteUrmaritPolitie) {
        this.esteUrmaritPolitie = esteUrmaritPolitie;
    }



    public boolean verificarePolitie(){
       return !esteUrmaritPolitie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EsteUrmaritPolitie{");
        sb.append("esteUrmaritPolitie=").append(esteUrmaritPolitie);
        sb.append('}');
        return sb.toString();
    }
}
