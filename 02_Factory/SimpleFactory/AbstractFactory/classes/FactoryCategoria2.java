package AbstractFactory.classes;

public class FactoryCategoria2 implements IFactory {
    @Override
    public IPachetCazare creazaPachetCazare() {
        return new CazareCategoria2();
    }

    @Override
    public IPachetTransport creazaPachetTransport() {
        return new TransportCategoria2();
    }
}
