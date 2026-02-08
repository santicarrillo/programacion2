import Condicon.Condicion;
import Modificacion.Modificacion;

import java.util.ArrayList;

public abstract class Heroe {
    protected String nombre;
    public Heroe(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public abstract int getTalle();
    public abstract ArrayList<String> getListMetales();
    public abstract boolean cumpleTraje(Condicion C);
    public abstract Heroe getCopia(Modificacion mm);
}
