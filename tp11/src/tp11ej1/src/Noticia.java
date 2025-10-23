package tp11ej1.src;

import java.util.ArrayList;

public class Noticia extends Elemento {
    private String titulo;
    private ArrayList <String>palabrasClaves;
    private String intro;
    private String texto;
    private String autor;
    private String link;

    public Noticia(String titulo, String intro, String texto, String autor, String link) {
        this.titulo = titulo;
        this.intro = intro;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        this.palabrasClaves = new ArrayList<>();
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIntro() {
        return intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<>(palabrasClaves);
    }
    public void addPalabraClave(String palabraClave) {
        palabrasClaves.add(palabraClave);
    }



    public int contarNoticias(){
        return 1;

    }
    private Elemento getCopia(){
        Noticia copia = new Noticia(getTitulo(), getIntro(), getTexto(), getAutor(), getLink());//se puede hacer en un metodo aparte
        for (String palabra : palabrasClaves) {
            copia.addPalabraClave(palabra);
        }
        return copia;
    }
    @Override
    public Elemento getCopiaRestringida(String pp) {
        if (palabrasClaves.contains(pp)) {
            Elemento copia = getCopia();
            return copia;
        }
        return null;
    }
}
