package BusquedaDocumento;

public class FiltrarLimiteContenido extends Buscar{
    private int limite;

    public FiltrarLimiteContenido(int limite) {
        this.limite = limite;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getCantContenido()<=limite;
    }
}
