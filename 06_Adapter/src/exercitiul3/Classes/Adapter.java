package exercitiul3.Classes;

public class Adapter implements IAplicatiaExistenta{


    private IFrameworkNou frameworkNou;

    public Adapter(IFrameworkNou frameworkNou) {
        this.frameworkNou = frameworkNou;
    }

    @Override
    public void acordaCredit() {
        frameworkNou.acordaLeasing();
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Adapter{");
        sb.append("frameworkNou=").append(frameworkNou);
        sb.append('}');
        return sb.toString();
    }
}
