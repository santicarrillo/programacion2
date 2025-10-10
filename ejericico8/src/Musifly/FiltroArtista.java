package Musifly;

public class FiltroArtista extends Buscar{
        private String artistaBuscado;

        public FiltroArtista(String artistaBuscado) {
            this.artistaBuscado = artistaBuscado.toLowerCase();
        }

        @Override
        public boolean cumple(Musica m) {
            if (m instanceof Pista) {
                Pista p = (Pista) m;
                return p.getArtista().toLowerCase().equals(artistaBuscado);
            }
            return false;
        }

}
