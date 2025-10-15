package Seguro;

import Seguro.FormaCalculo.FormaCalculo;

public class Segvida extends Seguro {

    public Segvida(String descripcion, long dni, double montoFijo, long poliza, FormaCalculo calculo) {
        super(descripcion, dni, montoFijo, poliza, calculo);
    }
}
