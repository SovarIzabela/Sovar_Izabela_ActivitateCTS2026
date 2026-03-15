package Exercitiul7.Classes;

import java.util.ArrayList;
import java.util.List;

public abstract class AMasina {

    protected String marca;
    protected String sasiu;
    protected List<String> listaServiciiTunning;

    public abstract void addServiciu(String serviciu);


}
