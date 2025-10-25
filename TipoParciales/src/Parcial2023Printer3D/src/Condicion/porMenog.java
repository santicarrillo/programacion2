package Parcial2023Printer3D.src.Condicion;

import Parcial2023Printer3D.src.Elemento;

public class porMenog extends Condicion {

    private  int gramoslimite;

    public porMenog(int gramoslimite) {
        this.gramoslimite = gramoslimite;
    }
    public boolean cumple(Elemento e) {
        return e.cantidadPla()<gramoslimite;
    }
}
