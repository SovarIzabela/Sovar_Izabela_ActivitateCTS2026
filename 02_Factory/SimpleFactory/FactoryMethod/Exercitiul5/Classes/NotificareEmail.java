package FactoryMethod.Exercitiul5.Classes;

public class NotificareEmail implements INotificare{

    private String mesajNotificare;
    private String numeDestinatar;

    public NotificareEmail(String mesajNotificare, String numeDestinatar) {
        this.mesajNotificare = mesajNotificare;
        this.numeDestinatar = numeDestinatar;
    }

    @Override
    public void descriereNotificare() {
        System.out.println("Aceasta este o notificare Email");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NotificareEmail{");
        sb.append("mesajNotificare='").append(mesajNotificare).append('\'');
        sb.append(", numeDestinatar='").append(numeDestinatar).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
