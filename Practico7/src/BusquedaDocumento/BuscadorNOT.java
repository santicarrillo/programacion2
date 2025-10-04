package BusquedaDocumento;

import Ejercicio1.Buscador;

public class BuscadorNOT extends Buscar{
    private Buscar b1;

    public BuscadorNOT(Buscar b1) {
        this.b1 = b1;
    }

    @Override
    public boolean cumple(Documento documento) {
        return !b1.cumple(documento);
    }
}

