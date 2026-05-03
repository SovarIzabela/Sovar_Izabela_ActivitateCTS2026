package exercitiul4.main;

import exercitiul4.classes.ElemOptionale;
import exercitiul4.classes.FlyweightSpectator;
import exercitiul4.classes.Spectator;

public class Main {

    public static void main(String [] args){

        ElemOptionale opt1 = new ElemOptionale("alb", 10);
        ElemOptionale opt2 = new ElemOptionale("verde", 11);
        ElemOptionale opt3 = new ElemOptionale("rosu", 15);
        ElemOptionale opt4 = new ElemOptionale("mov", 17);


        FlyweightSpectator flyweightSpectator = new FlyweightSpectator();
        Spectator spectator = flyweightSpectator.getSpectator(1, 153,60);
        Spectator spectator2 = flyweightSpectator.getSpectator(1, 200,60);
        spectator.descriere(opt1);
        spectator.descriere(opt2);
        spectator.descriere(opt3);
        spectator.descriere(opt4);

        spectator2.descriere(opt1);


    }



}
