package Parcial2023Printer3D.src;

import Parcial2023Printer3D.src.Condicion.Condicion;

import java.util.ArrayList;

public class Pieza extends Elemento{
    private double cantPla;
    private String color;
    private double tiempoEstimado;
    public Pieza(String nombre,String descripcion, double precioPla, double costoSegundoImpresion
            ,double extra,String color, double extraPeso, double tiempoEstimado, int gramos) {
        super(nombre,descripcion,precioPla,costoSegundoImpresion,extra);
        this.color = color;
        this.tiempoEstimado = tiempoEstimado;
    }
    public double cantidadPla() {
        return cantPla;
    }
    public void setCantPla(double cantPla) {
        this.cantPla = cantPla;
    }
    public ArrayList<String> getColor() {
        ArrayList<String>colores = new ArrayList<>();
        colores.add(this.color);
        return colores;
    }

    @Override
    public ArrayList<Pieza> Buscar(Condicion c) {
        ArrayList<Pieza> piezas = new ArrayList<>();
        if (c.cumple(this)) {
            piezas.add(this);
        }
        return piezas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTiempoEstimado() {
        return tiempoEstimado+getExtra();
    }
    public void setTiempoEstimado(double tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
}
