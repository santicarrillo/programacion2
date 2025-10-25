package Parcial2023Printer3D;

import Parcial2023Printer3D.src.Condicion.Condicion;
import Parcial2023Printer3D.src.Elemento;
import Parcial2023Printer3D.src.Pieza;
import Parcial2023Printer3D.src.PiezaCompuesta;

import java.util.ArrayList;

public class PiezaExclusiva extends Pieza {
    private  int CostoExtra;

    public PiezaExclusiva(String nombre, String descripcion, double precioPla, double costoSegundoImpresion, double extra, String color, double extraPeso, double tiempoEstimado, int gramos, int costoExtra) {
        super(nombre, descripcion, precioPla, costoSegundoImpresion, extra, color, extraPeso, tiempoEstimado, gramos);
        CostoExtra = costoExtra;
    }

    public int getCostoExtra() {
        return CostoExtra;
    }

    public void setCostoExtra(int costoExtra) {
        CostoExtra = costoExtra;
    }

    @Override
    public double getCosto(Elemento ee) {
        return super.getCosto(ee)+ getCostoExtra();
    }

    @Override
    public ArrayList<Pieza> Buscar(Condicion c) {
        return new ArrayList<>();
    }
}
