package Coleccionista;

import Coleccionista.condicion.Condicion;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Elecolec {
    public abstract double getvalor();
    public abstract int CantObj();
    public abstract ArrayList<Objeto>busqueda(Condicion c, Comparator<Objeto> cc);
    public abstract Elecolec getCopia();
    public abstract Elecolec getCopiarestringida(Condicion cc);

}
