package Noticias;

import Noticias.Filtros.Filtro;

public class NoticiaParalela extends Noticia {

   private Noticia asociada;

    public NoticiaParalela(String auto, String tema, String texto, String titulo, Noticia asociada) {
        super(auto, tema, texto, titulo);
        this.asociada = asociada;
    }

    @Override
    public void addComentario(Comentario cc) {
        super.addComentario(cc);
        asociada.addComentario(cc);
    }

    @Override
    public EleNoticia getCopia(Filtro filtro) {
        return null;
    }
}
