package exercitiul3.classes;

public class AreAlteCreante {

    private float valoareCreanteAlteBanci;
    private float venit;

    public AreAlteCreante(float valoareCreanteAlteBanci, float venit) {
        this.valoareCreanteAlteBanci = valoareCreanteAlteBanci;
        this.venit = venit;
    }

    public boolean verificaCreante(){
        return valoareCreanteAlteBanci<=venit*0.4;
    }



}
