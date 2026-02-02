package PrimerParcial;

import Parcial2023Printer3D.src.Elemento;
import PrimerParcial.filtroybusqueda.Buscar;

import java.util.ArrayList;

public class BOE extends ComandoInt{




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
        for (Comandot c : miembros){
            if (c.getvelocidad() > max){
                max = c.getvelocidad();
            }
        }
        return max;
    }
    public double getVeocidad(){

        return miembros.get(miembros.size()-1).getvelocidad();
    }

    @Override
    public double getingenio() {
        double total=0;
        double promedio=0;
        for (Comandot c : miembros){
            total+=c.getingenio();
        }
        promedio=total/miembros.size();
        return promedio;
    }




}
