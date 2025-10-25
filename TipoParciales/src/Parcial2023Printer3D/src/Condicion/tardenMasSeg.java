package Parcial2023Printer3D.src.Condicion;

import Parcial2023Printer3D.src.Elemento;

public class tardenMasSeg extends Condicion {
   private double limiteSeg;
    public tardenMasSeg(double limiteSeg) {
        this.limiteSeg = limiteSeg;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getTiempoEstimado()>limiteSeg;
    }
}
