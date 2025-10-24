package Parcial2023Printer3D.src;

import java.util.ArrayList;

public class Pieza extends Elemento{
    private double cantPla;
    private String color;
    private double tiempoEstimado;
    public Pieza(String nombre,String descripcion, double precioPla, double costoSegundoImpresion,double extra,String color, double extraPeso, double tiempoEstimado) {
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
    public void setColor(String color) {}

    public double getTiempoEstimado() {
        return tiempoEstimado+getExtra();
    }
    public void setTiempoEstimado(double tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
}
