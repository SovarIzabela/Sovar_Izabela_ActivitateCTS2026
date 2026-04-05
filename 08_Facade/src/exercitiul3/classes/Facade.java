package exercitiul3.classes;

public class Facade {


    public boolean deschidereCont(String numeClient, int varstaClient, boolean esteUrmaritPolitie, float valoareCreanteAlteBanci, float venit){

        AreAlteCreante areAlteCreante = new AreAlteCreante(valoareCreanteAlteBanci, venit);
        AreVarsta   areVarsta = new AreVarsta(numeClient, varstaClient);
        EsteUrmaritPolitie esteUrmaritPolitie1 = new EsteUrmaritPolitie(esteUrmaritPolitie);

        return areAlteCreante.verificaCreante()&&esteUrmaritPolitie1.verificarePolitie()&&areVarsta.areVarsta();

    }


}
