package Noticias;

import Noticias.Filtros.*;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class EleNoticia {

    public abstract int contador(Filtro filtro);
    public abstract String getTema();
    public abstract EleNoticia getCopia(Filtro filtro);
    public abstract ArrayList<Noticia> busqueda(Filtro filtro, Comparator<Noticia> cc);
}
