package exercitiul5.classes;

public class QuizNou implements IQuizNou{

    private String numeQuiz;
    private int numarIntrebari;


    public QuizNou(String numeQuiz, int numarIntrebari) {
        this.numeQuiz = numeQuiz;
        this.numarIntrebari = numarIntrebari;
    }

    @Override
    public void startQuiz() {
        System.out.println("Quizul a fost activat!");
    }

    @Override
    public String toString() {
        return "QuizNou{" +
                "numeQuiz='" + numeQuiz + '\'' +
                ", numarIntrebari=" + numarIntrebari +
                '}';
    }
}
