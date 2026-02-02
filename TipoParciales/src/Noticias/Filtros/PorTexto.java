package Noticias.Filtros;

import Noticias.Noticia;

public class PorTexto extends Filtro {
    private String Autor;

    public PorTexto(String autor) {
        Autor = autor;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return this.Autor.equals(noticia.getTema());
    }
}
