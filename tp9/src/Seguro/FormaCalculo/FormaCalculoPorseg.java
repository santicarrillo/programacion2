package Seguro.FormaCalculo;

import Seguro.Seguro;

public class FormaCalculoPorseg extends FormaCalculo {
    private int porcentaje;
            private final static int max=100;

    public FormaCalculoPorseg(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularCosto(Seguro seguro) {
        return (seguro.getMontoFijo()*porcentaje)/max;
    }
}
