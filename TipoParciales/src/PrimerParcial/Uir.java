package PrimerParcial;

import PrimerParcial.filtroybusqueda.Buscar;

import java.util.ArrayList;

public class Uir extends ComandoInt{


    @Override
    public ArrayList<Agente> buscar(Buscar b) {
        ArrayList<Agente> resultado =  new ArrayList<>();
        for (Comandot c : miembros) {
            resultado.addAll(c.buscar(b));
        }
        return resultado;
    }

    @Override
    public double getvelocidad() {
        double max=0;
        for (Comandot c : miembros) {
            if (c.getvelocidad() > max) {
                max = c.getvelocidad();
            }
        }
        return max;
    }

    @Override
    public double getingenio() {
        double total=0;
        if (!miembros.isEmpty()){
            total= miembros.get(0).getingenio();
        }
        return total;
    }
}
