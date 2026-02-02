package recuperatorio.recuperatorio.condiciones;

import recuperatorio.modelo.Compra;

public class CondicionNot extends Condicion {
    private Condicion condicion;

    public CondicionNot(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Compra compra) {
        return !condicion.cumple(compra);
    }
}
