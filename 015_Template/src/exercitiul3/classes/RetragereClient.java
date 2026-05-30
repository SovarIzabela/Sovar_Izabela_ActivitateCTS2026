package exercitiul3.classes;

public class RetragereClient extends RetragereBancomat{
    @Override
    protected void introducereCard() {
        System.out.println("Clientul introduce cardul.");
    }

    @Override
    protected void introducerePIN() {
        System.out.println("Clientul introduce PIN-ul.");
    }

    @Override
    protected void specificareSuma() {
        System.out.println("Clientul introduce suma .");
    }

    @Override
    protected void retragereBani() {
        System.out.println("Clientul retrage banii.");
    }

    @Override
    protected void retragereCard() {
        System.out.println("Clientul retrage cardul.");
    }
}
