package exercitiul3.classes;

public abstract class  RetragereBancomat {


    protected abstract void introducereCard();
    protected abstract void  introducerePIN();
    protected abstract void  specificareSuma();
    protected abstract void  retragereBani();
    protected abstract void  retragereCard();



    public final void retrageBani(){
        introducereCard();
        introducerePIN();
        specificareSuma();
        retragereBani();
        retragereCard();

    }




}
