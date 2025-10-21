package Parcial2023.Busqueda;

import Parcial2023.Presupuesto;

public class FiltroqueDurenMenos extends Buscador{

    private int diaLimite;
    public FiltroqueDurenMenos (int diaLimite){
        this.diaLimite=diaLimite;
    }

    @Override
    public boolean cumple(Presupuesto p) {
        return diaLimite <= p.getTiempoEstimado();
    }
}
