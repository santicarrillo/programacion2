package Noticias.Filtros;
import Noticias.*;
public class PorAutor extends Filtro{
  private String Autor;

    public PorAutor(String autor) {
        Autor = autor;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return this.Autor.equals(noticia.getAuto());
    }
}
