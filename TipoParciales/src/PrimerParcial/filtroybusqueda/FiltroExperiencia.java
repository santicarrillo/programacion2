package PrimerParcial.filtroybusqueda;

import PrimerParcial.Agente;

public class FiltroExperiencia extends Buscar {
    private int experiencia;
    public FiltroExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public boolean cumple(Agente a) {
        return a.getExperiencia()>this.experiencia;
    }
}
