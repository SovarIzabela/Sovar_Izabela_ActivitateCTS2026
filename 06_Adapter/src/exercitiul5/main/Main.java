package exercitiul5.main;

import exercitiul5.classes.*;

public class Main {


    public static void main(String[] args){

        IQuizExistent quizExistent = new QuizExistent("test1", " grila" , 15);
        quizExistent.genereazaTest();
        quizExistent.verificaRaspunsuri();


        IQuizNou quizNou = new QuizNou("QuizNou", 25);
        quizNou.startQuiz();

        IQuizExistent quizAdaptat = new QuizAdaptat(quizNou);
        quizAdaptat.genereazaTest();
        quizAdaptat.verificaRaspunsuri();



    }
}
