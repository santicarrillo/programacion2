package PrimerParcial.filtroybusqueda;

import PrimerParcial.Agente;

public class FiltroHabilidad extends Buscar{
    private String habilidad;

    public FiltroHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public boolean cumple(Agente a) {
        return a.getHabilidades().contains(this.habilidad);
    }
}
