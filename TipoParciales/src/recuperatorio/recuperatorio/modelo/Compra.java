package recuperatorio.recuperatorio.modelo;

import org.w3c.dom.ls.LSOutput;
import recuperatorio.recuperatorio.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Comparator;

public class Compra extends Envio {

    private ArrayList<String> productos;
    private Destinatario destinatario;
    private boolean entregado;
    private int tiempoEstimado;
    private double kilometros;

    public Compra(Destinatario destinatario, int tiempoEstimado, double kilometros) {
        this.destinatario = destinatario;
        this.tiempoEstimado = tiempoEstimado;
        this.kilometros = kilometros;
        this.productos = new ArrayList<>();
        this.entregado = false;
    }

    public void addProducto(String producto) {
        this.productos.add(producto);
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public double getKilometros() {
        return kilometros;
    }

    @Override
    public boolean estaEntregado() {
        return entregado;
    }

    @Override
    public String getCiudadDestino() {
        return destinatario.getCiudad();
    }

    @Override
    public int getTiempoEstimado() {
        return this.tiempoEstimado;
    }

    public int getCantidadProductos() {
        return  this.productos.size();
    }

    @Override
    public Compra siguiente(Comparator<Compra> estrategia) {
        if ( !this.estaEntregado())
            return this;
        else return null;
    }

    private void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    @Override
    public Envio getCopia(Condicion condicion) {
        if (condicion.cumple(this)) {
            Compra copiaCompra = new Compra(this.destinatario, this.tiempoEstimado, this.kilometros);
            copiaCompra.setEntregado(this.entregado);
            for (String producto:productos)
                copiaCompra.addProducto(producto);
        }
        return null;
    }


    @Override
    public String toString() {
        return this.getCantidadProductos()+ " productos ("+this.productos+") a "+
                getDestinatario().getNombre()+" "+getDestinatario().getApellido()+ " en "+
                getCiudadDestino()+" a "+ getKilometros()+" km de distancia, con un tiempo estimado de "+
                getTiempoEstimado()+" minutos";
    }
}
