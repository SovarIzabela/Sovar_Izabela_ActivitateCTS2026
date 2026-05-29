package AbstractFactory.classes;

public class FactoryCategoria1 implements IFactory{
    @Override
    public IPachetCazare creazaPachetCazare() {
        return new CazareCategoria1();
    }

    @Override
    public IPachetTransport creazaPachetTransport() {
        return new TransportCategoria1();
    }
}
