package recuperatorio.recuperatorio.condiciones;

import recuperatorio.modelo.Compra;

public class CondicionCantidadProductos extends Condicion {
    private int productosMinimos;

    public CondicionCantidadProductos(int productosMinimos) {
        this.productosMinimos = productosMinimos;
    }

    @Override
    public boolean cumple(Compra compra) {
        return compra.getCantidadProductos() > this.productosMinimos;
    }
}
