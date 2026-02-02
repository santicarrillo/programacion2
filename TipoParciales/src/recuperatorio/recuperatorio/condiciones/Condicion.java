package recuperatorio.recuperatorio.condiciones;

import recuperatorio.modelo.Compra;

public abstract class Condicion {
    public abstract boolean cumple(Compra compra);
}
