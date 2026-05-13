package exercitiul7.classes;

public class Antrenor implements IAntrenor{
    @Override
    public void creareAbonament() {
        System.out.println("Abonamentul a fost creat!");
    }

    @Override
    public void programareEvaluare() {
        System.out.println("Evaluare programata!");
    }

    @Override
    public void anulareProgramare() {
        System.out.println("Programarea a fost anulata!!");
    }
}
