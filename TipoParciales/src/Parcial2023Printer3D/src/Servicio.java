package Parcial2023Printer3D.src;

import Parcial2023Printer3D.src.Condicion.Condicion;

import java.util.ArrayList;

public class Servicio {

    public int  cantidadPiezaSimple(PiezaCompuesta pc){
        return pc.cantidadPiezas();

    }

    public ArrayList<Pieza> todoAlRojo(Elemento e,Condicion c ){
      return e.Buscar(c);
    }

    public ArrayList<String>Listcolor(Elemento pc){
        return pc.getColor();
    }


}
