package Parcial2023Printer3D.src;

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
            suma+=e.getTiempoEstimado()+e.getExtra();
        }
        return suma;
    }

    @Override
    public double cantidadPla() {
        double suma=0;
        for (Elemento e : elementos){
            suma+= e.cantidadPla()+e.getExtra();
        }
    return suma;
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
}
