package PrimerParcial.filtroybusqueda;

import PrimerParcial.Agente;

public class FiltroIngenio extends Buscar {
    private  double ingenio;

    public FiltroIngenio(double ingenio) {
        this.ingenio = ingenio;
    }
    @Override
    public boolean cumple(Agente a) {
        return a.getingenio()==this.ingenio;
    }
}
