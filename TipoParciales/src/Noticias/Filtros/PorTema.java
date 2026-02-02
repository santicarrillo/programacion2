package Noticias.Filtros;

import Noticias.Noticia;

public class PorTema extends Filtro{
    private String tema;

    public PorTema(String tema) {
        this.tema = tema;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return this.tema.equals(noticia.getTema());
    }
}
