package Parcial2023.Calcula;

import Parcial2023.Presupuesto;

public abstract class CalculaCosto {
    protected double valorBase;

    public CalculaCosto(int valorbase) {
    this.valorBase=valorbase;
    }

    public abstract double calcula(Presupuesto p);
}
