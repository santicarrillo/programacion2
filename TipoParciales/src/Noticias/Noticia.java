package Noticias;

import Noticias.Filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public class Noticia extends EleNoticia {
    private String tema;
    private String titulo,texto,auto;
    private ArrayList<Comentario> comentarios;

    public Noticia(String auto, String tema, String texto, String titulo) {
        this.auto = auto;
        this.comentarios = new ArrayList<>();
        this.tema = tema;
        this.texto = texto;
        this.titulo = titulo;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }


    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
public void addComentario(Comentario cc){
    comentarios.add(cc);
}
    @Override
    public String getTema() {
        return tema;
    }
    protected Noticia cascaron(){
        return new Noticia(getAuto(),getTema(),getTexto(),getTitulo());
    }
    @Override
    public EleNoticia getCopia(Filtro filtro) {
        if(filtro.cumple(this)){
            Noticia copia = cascaron();
            return copia;
        }
        return null;
    }

    @Override
    public int contador(Filtro filtro) {
        if (filtro.cumple(this)) {
            return 1;
        }
        return 0;
    }

    @Override
    public ArrayList<Noticia> busqueda(Filtro filtro, Comparator<Noticia> cc) {
        ArrayList<Noticia> noticias = new ArrayList<>();
        if (filtro.cumple(this)) {
            noticias.add(this);
        }
        return noticias;
    }
}
