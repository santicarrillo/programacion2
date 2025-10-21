package Parcial2023.Busqueda;

import Parcial2023.Presupuesto;

public class FiltroNot extends Buscador{
    Buscador b;

    public FiltroNot( Buscador b) {

        this.b = b;
    }

    @Override
    public boolean cumple(Presupuesto p) {
        return !b.cumple(p);
    }
}
