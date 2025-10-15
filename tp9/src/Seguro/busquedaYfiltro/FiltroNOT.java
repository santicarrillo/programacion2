package Seguro.busquedaYfiltro;

import Seguro.Seguro;

public class FiltroNOT extends Buscador {
    private Buscador b1;

    public FiltroNOT(Buscador b1) {
        this.b1 = b1;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return !b1.cumple(seguro);
    }
}
