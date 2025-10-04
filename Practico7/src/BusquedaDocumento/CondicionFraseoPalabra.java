package BusquedaDocumento;


public class CondicionFraseoPalabra extends Buscar {
    private String palabraClave;

    public CondicionFraseoPalabra(String palabraClave) {
        this.palabraClave = palabraClave.toLowerCase();
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().toLowerCase().contains(palabraClave);
    }
}
