package Parcial2023Printer3D.src;

import Parcial2023Printer3D.src.Condicion.Condicion;

public class PiezaDiseño extends PiezaCompuesta{
    Condicion c;

    public PiezaDiseño(String nombre, String descripcion, double precioPla, double costoSegundoImpresion, double extra,Condicion c) {
        super(nombre, descripcion, precioPla, costoSegundoImpresion, extra);
        this.c=c;
    }

    @Override
    public void addElementos(Elemento e) {
        if (c.cumple(e)){
            elementos.add(e);
        }
    }
}
