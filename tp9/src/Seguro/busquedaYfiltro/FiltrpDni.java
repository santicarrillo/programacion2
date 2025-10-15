package Seguro.busquedaYfiltro;

import Seguro.Seguro;

public class FiltrpDni extends  Buscador {

    private long dni;

    public FiltrpDni(long dni) {
        this.dni = dni;
    }

    @Override
    public boolean cumple(Seguro s) {
        return s.getDni()==dni;
    }
}
