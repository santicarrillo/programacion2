package Coleccionista;

import Coleccionista.condicion.Condicion;

public class Sucoleccion extends Coleccion{
    Condicion condicion;

    public Sucoleccion(Condicion condicion){
        this.condicion=condicion;
    }


    @Override
    public void addColeccion(Coleccion c) {
        if (condicion.cumple(c)){
            super.addColeccion(c);
        }
    }

    @Override
    public Sucoleccion cascaron(){
        return new Sucoleccion(condicion);
    }

}
