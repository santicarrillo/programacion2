package Parcial2023.Calcula;

import Parcial2023.Presupuesto;

public class CalculaPordia extends CalculaCosto {


    public CalculaPordia(int valorbase) {
        super(valorbase);
    }

    @Override
    public double calcula(Presupuesto p) {
        return valorBase*p.getTiempoEstimado();
    }
}
