package Seguro;

import Seguro.FormaCalculo.FormaCalculo;

public class SegAutomotor extends Seguro{

    public SegAutomotor(String descripcion, long dni, double montoFijo, long poliza, FormaCalculo calculo) {
        super(descripcion, dni, montoFijo, poliza,calculo);
    }


}
