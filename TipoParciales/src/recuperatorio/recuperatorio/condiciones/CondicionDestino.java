package recuperatorio.recuperatorio.condiciones;

import recuperatorio.modelo.Compra;

public class CondicionDestino extends Condicion {
    private String destinoBuscado;

    public CondicionDestino(String destinoBuscado) {
        this.destinoBuscado = destinoBuscado;
    }

    @Override
    public boolean cumple(Compra compra) {
        return compra.getCiudadDestino().equals(this.destinoBuscado);
    }
}
