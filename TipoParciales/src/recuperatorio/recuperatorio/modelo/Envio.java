package recuperatorio.recuperatorio.modelo;

import recuperatorio.recuperatorio.condiciones.Condicion;

import java.util.Comparator;

public abstract class Envio {

    public abstract boolean estaEntregado();
    public abstract String getCiudadDestino();
    public abstract int getTiempoEstimado();
    public abstract Compra siguiente(Comparator<Compra> estrategia);
    public abstract Envio getCopia(Condicion condicion);
}
