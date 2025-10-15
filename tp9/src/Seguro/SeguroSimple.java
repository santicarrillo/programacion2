package Seguro;

import Seguro.FormaCalculo.FormaCalculo;
import Seguro.busquedaYfiltro.Buscador;

import java.util.ArrayList;

public abstract class SeguroSimple extends Seguro {
    protected long poliza;
    protected double montoFijo;
    private FormaCalculo calculo;

    public SeguroSimple(String descripcion, long dni, double montoFijo, long poliza, FormaCalculo calculo) {
         super(descripcion, dni);
        this.descripcion = descripcion;
        this.dni = dni;
        this.montoFijo = montoFijo;
        this.poliza = poliza;
        this.calculo = calculo;
    }

    public void setMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getDni() {
        return dni;
    }


    public void setCalculo(FormaCalculo calculo) {
        this.calculo = calculo;
    }


    public void setPoliza(long poliza) {
        this.poliza = poliza;
    }

    @Override
    public double calcularCosto() {
        return calculo.calcularCosto(this);
    }

    @Override
    public long getPoliza() {
        return poliza;
    }
    @Override
    public double getMontoFijo() {
        return montoFijo;
    }

    @Override
    public ArrayList<Seguro> buscar(Buscador buscador) {
        ArrayList<Seguro> resultado = new ArrayList<>();

        if (buscador.cumple(this)){
            resultado.add(this);
        }
    return resultado;
    }
}
