package PrimerParcial.filtroybusqueda;

import PrimerParcial.Agente;

public class FiltroOr extends Buscar {
    Buscar b1,b2;

    public FiltroOr(Buscar b1, Buscar b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public boolean cumple(Agente a) {
        return b1.cumple(a) || b2.cumple(a);
    }

}
