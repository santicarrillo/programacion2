package Seguro.busquedaYfiltro;

import Seguro.Seguro;

public class FiltroAND extends Buscador {
    private Buscador b1,b2;

    public FiltroAND(Buscador b1, Buscador b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return b1.cumple(seguro) && b2.cumple(seguro);
    }
}
