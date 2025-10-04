package BusquedaDocumento;

public class CondicionTitulo extends Buscar {
        private String tituloAbuscar;

        public CondicionTitulo(String tituloAbuscar) {
            this.tituloAbuscar = tituloAbuscar;
        }
    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().equals(tituloAbuscar);

    }


}
