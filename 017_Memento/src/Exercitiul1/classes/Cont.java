package Exercitiul1.classes;

public class Cont {

    private String numeClint;
    private float valoare;

    public Cont(String numeClint, float valoare) {
        this.numeClint = numeClint;
        this.valoare = valoare;
    }

    public float getValoare() {
        return valoare;
    }

    public void setValoare(float valoare) {
        this.valoare=valoare;
    }

    public MementoCont salveazaMemento(){
        return new MementoCont(this.valoare);
    }

    public void undo(MementoCont mementoCont){
        this.valoare = mementoCont.getSuma();
    }



    @Override
    public String toString() {
        return "Cont{" +
                "numeClint='" + numeClint + '\'' +
                ", suma=" + valoare +
                '}';
    }
}
