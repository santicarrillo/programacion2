package Seguro;

import Seguro.FormaCalculo.FormaCalculo;

public abstract class Seguro {
    protected String descripcion;
    protected long poliza, dni;
    protected double montoFijo;
    private FormaCalculo calculo;

    public Seguro(String descripcion, long dni, double montoFijo, long poliza,FormaCalculo calculo) {
        this.descripcion = descripcion;
        this.dni = dni;
        this.montoFijo = montoFijo;
        this.poliza = poliza;
        this.calculo = calculo;
    }

    public double getMontoFijo() {
        return montoFijo;
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

    public double CalculaCosto() {
        return calculo.calcularCosto(this);
    }

    public void setCalculo(FormaCalculo calculo) {
        this.calculo = calculo;
    }

    public long getPoliza() {
        return poliza;
    }

    public void setPoliza(long poliza) {
        this.poliza = poliza;
    }


}
