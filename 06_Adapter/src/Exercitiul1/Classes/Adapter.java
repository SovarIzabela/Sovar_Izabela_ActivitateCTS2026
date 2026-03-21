package Exercitiul1.Classes;

public class Adapter implements IsoftExistent{

    private IsoftNouBar softNouBar;

    public Adapter(IsoftNouBar softNouBar) {
        this.softNouBar = softNouBar;
    }

    @Override
    public void printeazaFactura( ) {
        softNouBar.emiteNota();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Adapter{");
        sb.append("softNouBar=").append(softNouBar);
        sb.append('}');
        return sb.toString();
    }
}
