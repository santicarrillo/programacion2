package recuperatorio.recuperatorio.condiciones;

import recuperatorio.modelo.Compra;

public class CondicionOr extends Condicion {
    private Condicion c1, c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Compra compra) {
        return c1.cumple(compra) || c2.cumple(compra);
    }
}
