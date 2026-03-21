package Exercitiul1.Classes;

public class NotaDecorata extends ANotaDePlata{
    public NotaDecorata(Inota notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Se printeaza si o felicitare pentru !" + super.getNumeClient());
    }
}
