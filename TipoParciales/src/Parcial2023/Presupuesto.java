package Parcial2023;

import Parcial2023.Busqueda.Buscador;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Presupuesto {
    protected String nombre;
    protected  ArrayList<String>materiales;
    protected int CantEmpleado;
    protected int tiempoEstimado;

    public Presupuesto(int cantEmpleado, String nombre, int tiempoEstimado) {

        CantEmpleado = cantEmpleado;
        this.materiales = new ArrayList<>();
        this.nombre = nombre;
        this.tiempoEstimado = tiempoEstimado;
    }
    public void addMaterial(String m){
        this.materiales.add(m);
    }

    public abstract ArrayList<String>getMateriales( );
    public abstract int  CantEmpleados();
    public abstract int getTiempoEstimado();
    public abstract double getcalcula();
    public abstract ArrayList<Presupuesto>Busca(Buscador b);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
