package Parcial2023Printer3D.src.Condicion;

import Parcial2023Printer3D.src.Elemento;

public class Not extends Condicion {
    private Condicion c1;

    public  Not(Condicion c1) {
        this.c1 = c1;
    }

    @Override
        public boolean cumple(Elemento e){
         return  !this.c1.cumple(e);
    }
}
