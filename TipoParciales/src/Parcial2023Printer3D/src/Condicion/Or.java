package Parcial2023Printer3D.src.Condicion;

import Parcial2023Printer3D.src.Elemento;

public class Or extends Condicion {

    private Condicion c1;
    private Condicion c2;
    public Or(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Elemento e) {
        return c1.cumple(e) || c2.cumple(e);
    }
}
