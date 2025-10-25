package Parcial2023Printer3D.src;

import Parcial2023Printer3D.src.Condicion.Condicion;

import java.util.ArrayList;

public abstract class Elemento {
    private String nombre;
    private String descripcion;
    protected double precioPla;
    protected double costoSegundoImpresion;
    protected double extra;
    public Elemento(String nombre, String descripcion, double precioPla, double costoSegundoImpresion, double extra) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioPla = precioPla;
        this.costoSegundoImpresion = costoSegundoImpresion;
        this.extra = extra;
    }
    public double getExtra() {
        return extra;
    }
    public void setExtra(double extra) {
        this.extra = extra;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecioPla() {
        return precioPla;
    }
    public void setPrecioPla(double precioPla) {
        this.precioPla = precioPla;
    }
    public double getCostoSegundoImpresion() {
        return costoSegundoImpresion;
    }
    public void setCostoSegundoImpresion(double costoSegundoImpresion) {
        this.costoSegundoImpresion = costoSegundoImpresion;
    }
    public abstract double getTiempoEstimado();
    public abstract double cantidadPla();
    public abstract ArrayList<String> getColor();
    public  ArrayList<Pieza>Buscar(Condicion c){

    }

    /*cantidad de PLA necesario por
    el precio del gramo PLA más la cantidad de segundos de impresión por un costo de segundo de impresión. */
    public  double getCosto(Elemento ee){
        return ((ee.cantidadPla()*getPrecioPla())+(ee.getTiempoEstimado()*getCostoSegundoImpresion()));
    }


}
