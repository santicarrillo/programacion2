package tp11ej2.condicionadore;

import tp11ej2.Figura;

public class Preciomenor extends Condicion {

    private double presio;

    public Preciomenor(double precio) {
        this.presio = precio;
    }
    @Override
    public boolean cumple(Figura f){
       return f.getprecio()<this.presio;
    }
}
