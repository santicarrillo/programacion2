package PrimerParcial.filtroybusqueda;

import PrimerParcial.*;

public class filtroVelocidad extends Buscar{
    private double velocidad;
    public filtroVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public boolean cumple(Agente a) {
     return a.getvelocidad() == this.velocidad;
    }
}
