package BusquedaDocumento;

public class FiltroAutor extends Buscar{
    private String nombreAutor;

    public FiltroAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor.toLowerCase();
    }

    @Override
    public boolean cumple(Documento d) {
        for (String palabra : d.getAutores()) {
            if (palabra.toLowerCase().equals(nombreAutor)) {
                return true;
            }
        }
        return false;
    }
}
