package FactoryMethod.Exercitiul5.Classes;

public class NotificareSMS implements INotificare {

    private String mesajNotificare;
    private String numeDestinatar;

    public NotificareSMS(String mesajNotificare, String numeDestinatar) {
        this.mesajNotificare = mesajNotificare;
        this.numeDestinatar = numeDestinatar;
    }

    @Override
    public void descriereNotificare() {
        System.out.println("Aceasta este o notificare SMS");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NotificareSMS{");
        sb.append("mesajNotificare='").append(mesajNotificare).append('\'');
        sb.append(", numeDestinatar='").append(numeDestinatar).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
