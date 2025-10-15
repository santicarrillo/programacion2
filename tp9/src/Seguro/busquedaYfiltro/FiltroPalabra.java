package Seguro.busquedaYfiltro;

import Seguro.Seguro;

import java.util.ArrayList;

public class FiltroPalabra extends  Buscador {
    private ArrayList<Seguro> seguros;
    private String palabraClave;

    @Override
    public boolean cumple(Seguro s) {
        return  s.getDescripcion().contains(palabraClave);
    }
}