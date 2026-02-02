package Parcial2023Printer3D.src;

import Parcial2023Printer3D.src.Condicion.Condicion;

import java.util.ArrayList;

public class PiezaCompuesta extends Elemento{
    protected ArrayList<Elemento> elementos;
    public PiezaCompuesta(String nombre, String descripcion, double precioPla, double costoSegundoImpresion,double extra){
        super(nombre,descripcion,precioPla,costoSegundoImpresion,extra);
        this.elementos=new ArrayList<>();
    }
    public ArrayList<Elemento> getElementos() {
        return new ArrayList<>(elementos);
    }
    public void addElementos(Elemento e) {
        elementos.add(e);
    }


    @Override
    public double getTiempoEstimado(){
        double suma=0;
        for(Elemento e:elementos){
            suma+=e.getTiempoEstimado()+this.getExtra();
        }
        return suma;
    }
    public ArrayList<Pieza>ge

    @Override
    public double cantidadPla() {
        double suma=0;
        for (Elemento e : elementos){
            suma+= e.cantidadPla()+e.getExtra();
        }
    return suma;
    }
    public int cantidadPiezas( ){
        return elementos.size();
    }
    @Override
    public ArrayList<String> getColor() {
        ArrayList<String> resultado = new ArrayList<>();

        for (Elemento e : elementos){
            for (String s : e.getColor())
                    if (!resultado.contains(s)){
                resultado.add(s);
            }
        }
        return resultado;
    }

    @Override
    public ArrayList<Pieza> Buscar(Condicion c) {
        ArrayList<Elemento> resultado = new ArrayList<>();
        for (Elemento e : elementos){
            if (c.cumple(e)){
                resultado.add( e);
            }
        }
        return resultado;
    }
}
