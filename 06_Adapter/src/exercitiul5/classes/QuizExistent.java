package exercitiul5.classes;

public class QuizExistent implements IQuizExistent{

    private String numeTest;
    private String tipTest;
    private int nrIntrebari;

    public QuizExistent(String numeTest, String tipTest, int nrIntrebari) {
        this.numeTest = numeTest;
        this.tipTest = tipTest;
        this.nrIntrebari = nrIntrebari;
    }

    public String getNumeTest() {
        return numeTest;
    }

    @Override
    public void genereazaTest() {
        System.out.println("S-a generat tesstul ->" + numeTest);
    }

    @Override
    public void verificaRaspunsuri() {
        System.out.println("S-a verificat raspunsul pentru " + numeTest);
    }

    @Override
    public String toString() {
        return "QuizExistent{" +
                "numeTest='" + numeTest + '\'' +
                ", tipTest='" + tipTest + '\'' +
                ", nrIntrebari=" + nrIntrebari +
                '}';
    }
}
