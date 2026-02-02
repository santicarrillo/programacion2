package recuperatorio.recuperatorio.condiciones;

import recuperatorio.modelo.Compra;

public class CondicionEntregadas extends Condicion {
    @Override
    public boolean cumple(Compra compra) {
        return compra.estaEntregado();
    }
}
