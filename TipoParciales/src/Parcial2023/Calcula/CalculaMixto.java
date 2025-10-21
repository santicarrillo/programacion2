package Parcial2023.Calcula;

import Parcial2023.Presupuesto;

public class CalculaMixto extends CalculaCosto {

    private double otroValor;

    public CalculaMixto(int valorbase, double otroValor) {
        super(valorbase);
        this.otroValor = otroValor;
    }

    @Override
    public double calcula(Presupuesto p) {
        return valorBase+this.otroValor*p.getTiempoEstimado();
    }
}
