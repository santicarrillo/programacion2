package BusquedaDocumento;

public class BuscadorAnd extends Buscar{
    private Buscar b1,b2;

    public BuscadorAnd(Buscar b1, Buscar b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public boolean cumple(Documento d) {
        return b1.cumple(d) && b2.cumple(d);
    }
}
