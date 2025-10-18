package PrimerParcial;

import PrimerParcial.filtroybusqueda.Buscar;

import java.util.ArrayList;


public  abstract class ComandoInt extends  Comandot{
    protected ArrayList<Comandot> miembros;

    public ComandoInt( ) {
        super();
        this.miembros = new ArrayList<>();
    }

    public void addMiembro(ComandoInt c){
        miembros.add(c);
    }

    @Override
    public  ArrayList<String> getHabilidades(){
        ArrayList<String> resultado = new ArrayList<>();
        for (Comandot c :miembros){
            for (String h : c.getHabilidades()) {
                if (!resultado.contains(h)) {
                    resultado.add(h);
                }
            }
        }
        return resultado;
    }

    @Override
    public abstract ArrayList<Agente> buscar(Buscar b);

    @Override
    public abstract double getvelocidad();

    @Override
    public abstract double getingenio() ;
}
