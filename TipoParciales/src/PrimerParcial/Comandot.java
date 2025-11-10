package PrimerParcial;

import java.util.ArrayList;
import PrimerParcial.filtroybusqueda.*;
public  abstract class Comandot {

    public abstract double getvelocidad();

    public abstract double getingenio();

    public abstract ArrayList<String> getHabilidades();

    public abstract ArrayList<Agente> buscar(Buscar b);

    public abstract Comandot getcopia();
}

