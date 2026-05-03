package exercitiul5.classes;

public class QuizAdaptat implements IQuizExistent{



    private IQuizNou quizNou;

    public QuizAdaptat(IQuizNou quizNou) {
        this.quizNou = quizNou;
    }

    @Override
    public void genereazaTest() {
        quizNou.startQuiz();
    }

    @Override
    public void verificaRaspunsuri() {
        System.out.println("Se verifica raspunsul pentru quiz-ul nou");
    }

    @Override
    public String toString() {
        return "QuizAdaptat{" +
                "quizNou=" + quizNou +
                '}';
    }
}
