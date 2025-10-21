package Parcial2023.Busqueda;

import Parcial2023.Presupuesto;
import PrimerParcial.Agente;

public class BuscadorAnd extends Buscador{
    Buscador b1,b2;

    public BuscadorAnd(Buscador b1, Buscador b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public boolean cumple(Presupuesto p) {
        return b1.cumple(p) && b2.cumple(p);
    }
}


