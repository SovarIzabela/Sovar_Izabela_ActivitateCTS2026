package FactoryMethod.Exercitiul7.Classes;

import java.util.List;

public interface Ifactory {
    AMasina creazaMasina(String marca, String sasiu, List<String> listaServiciiTunning);
}
