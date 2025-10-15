package Seguro;

import Seguro.busquedaYfiltro.Buscador;

import java.util.ArrayList;

public class SegIntegrador extends Seguro {
    private double montoasegurado;
    private ArrayList<Seguro> seguros;

    public SegIntegrador(String descripcion, long dni, double montoasegurado) {
        super(descripcion, dni);
        this.montoasegurado = montoasegurado;
        this.seguros = new ArrayList<Seguro>();
    }

    public void addseguros(SeguroSimple s) {
        seguros.add(s);

    }
    @Override
    public double getMontoFijo() {
        double total=0;
        for (Seguro s: seguros) {
            total += montoasegurado;
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

    @Override
    public ArrayList<Seguro> buscar(Buscador buscador) {
        ArrayList<Seguro> resultado = new ArrayList<>();
        for (Seguro s : seguros) {
                resultado.addAll(s.buscar(buscador));

        }
        return resultado;

    }

    @Override
    public double calcularCosto() {
        return 0;
    }
}
