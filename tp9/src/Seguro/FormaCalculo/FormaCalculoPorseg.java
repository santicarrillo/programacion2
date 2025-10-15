package Seguro.FormaCalculo;

import Seguro.SeguroSimple;

public class FormaCalculoPorseg extends FormaCalculo {
    private int porcentaje;
            private final static int max=100;

    public FormaCalculoPorseg(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularCosto(SeguroSimple seguro) {
        return (seguro.getMontoFijo()*porcentaje)/max;
    }
}
