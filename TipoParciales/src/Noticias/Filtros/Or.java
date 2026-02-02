package Noticias.Filtros;

import Noticias.Noticia;

public class Or extends Filtro {
    private Filtro f1,f2;

    public Or (Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return f1.cumple(noticia) || f2.cumple(noticia);
    }
}
