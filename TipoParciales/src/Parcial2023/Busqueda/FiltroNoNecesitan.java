package Parcial2023.Busqueda;

import Parcial2023.Presupuesto;

public class FiltroNoNecesitan extends Buscador{
    public String nombre;

    public FiltroNoNecesitan(String nombre){
        this.nombre= nombre;
    }

    @Override
    public boolean cumple(Presupuesto p) {
        return !p.getNombre().equals(nombre);
    }
}
