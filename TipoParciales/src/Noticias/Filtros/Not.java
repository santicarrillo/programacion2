package Noticias.Filtros;

import Noticias.Noticia;

public class Not extends Filtro {
    private Filtro f;

    public Not(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return !f.cumple(noticia);
    }
}
