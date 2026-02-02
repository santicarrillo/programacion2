package recuperatorio.recuperatorio.estrategias;

import recuperatorio.modelo.Compra;

import java.util.Comparator;

public class EstrategiaMaximizada implements Comparator<Compra> {
    @Override
    public int compare(Compra o1, Compra o2) {
        return o2.getCantidadProductos() - o1.getCantidadProductos();
    }

    @Override
    public String toString() {
        return "Estrategia mayor cantidad de productos";
    }
}
