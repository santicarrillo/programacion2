package Seguro;

import Seguro.FormaCalculo.FormaCalculo;

import java.util.ArrayList;

public class SegIntegrador extends Seguro {
    private double montoasegurado;
    private ArrayList<Seguro> seguros;
    public SegIntegrador(String descripcion, long dni, double montoFijo, long poliza, FormaCalculo calculo,double monto) {
        super(descripcion, dni, montoFijo, poliza, calculo);
        this.montoasegurado =monto;
        this.seguros = new ArrayList<Seguro>();
    }

    public void addseguros(Seguro s) {
        seguros.add(s);

    }
    @Override
    public double getMontoFijo() {
        double total=0;
        for (Seguro s: seguros) {
            total +=  s.getMontoFijo();
        }
        return total;
    }

    @Override
    public long getPoliza() {
        long max=0;
        for (Seguro seguro: seguros) {
            if (seguro.getPoliza() > max) {
                max= seguro.getPoliza();
            }
        }
        return max;
    }


}
