package Seguro;

import Seguro.busquedaYfiltro.Buscador;

import java.util.ArrayList;

public abstract class Seguro {

    protected String descripcion;
    protected long dni;

    public Seguro(String descripcion, long dni) {
        this.descripcion = descripcion;
        this.dni = dni;
    }

    public abstract double getMontoFijo();
    public abstract long getPoliza();
    public abstract double calcularCosto();
    public abstract ArrayList<Seguro>buscar(Buscador buscador);

    public String getDescripcion() {
        return descripcion;
    }

    public long getDni() {
        return dni;
    }



}
