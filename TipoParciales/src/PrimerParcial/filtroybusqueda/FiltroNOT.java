package PrimerParcial.filtroybusqueda;

import PrimerParcial.Agente;

public class FiltroNOT extends Buscar{
    private Buscar b1;
    public FiltroNOT(Buscar b1) {
        this.b1 = b1;
    }

    @Override
    public boolean cumple(Agente a) {
        return !b1.cumple(a);
    }
}
