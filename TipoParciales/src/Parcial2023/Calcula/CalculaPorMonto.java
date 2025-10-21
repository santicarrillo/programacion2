package Parcial2023.Calcula;

import Parcial2023.Presupuesto;

public class CalculaPorMonto  extends CalculaCosto{
    @Override
    public double calcula(Presupuesto p) {
        return valorBase;
    }
}
