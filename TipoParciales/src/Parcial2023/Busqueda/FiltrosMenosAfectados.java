package Parcial2023.Busqueda;

import Parcial2023.Presupuesto;

public class FiltrosMenosAfectados extends Buscador{
    public int cantEmpelado;

    public FiltrosMenosAfectados(int cantEmpelado){
        this.cantEmpelado=cantEmpelado;
    }

    @Override
    public boolean cumple(Presupuesto p){
        return cantEmpelado < p.CantEmpleados();
    }

}
