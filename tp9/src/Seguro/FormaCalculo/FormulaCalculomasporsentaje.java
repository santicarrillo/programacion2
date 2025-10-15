package Seguro.FormaCalculo;

import Seguro.Seguro;

public class FormulaCalculomasporsentaje extends FormaCalculo {

    private double porcentaje;
    private static final int max=100;

    public FormulaCalculomasporsentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularCosto(Seguro seguro) {
        return seguro.getMontoFijo() + (seguro.getMontoFijo() * porcentaje / max);
    }

}
