package Parcial2023Printer3D.src.Condicion;

import Parcial2023Printer3D.src.Elemento;

public class Porcolor extends Condicion{
    private String color;

    public Porcolor(String color) {
        this.color = color;
    }

    @Override
    public boolean cumple(Elemento e) {
        for (String c: e.getColor()){
            if (c.equals(color)){
                return  true;
            }
        }
        return false;
    }
}
