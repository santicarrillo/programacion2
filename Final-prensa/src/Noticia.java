import java.util.ArrayList;

public class Noticia extends Prensa{
protected String contenido,editor,categoria;


    public Noticia(String titulo, Condicion condicion, String contenido, String editor, String categoria) {
        super(titulo, condicion);
        this.contenido = contenido;
        this.editor = editor;
        this.categoria = categoria;
        this.palabraCalve = new ArrayList<>();
    }


    @Override
    public void addPalabra(String palabra) {
        if (!this.palabraCalve.contains(palabra)) {
            palabraCalve.add(palabra);
        }
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public ArrayList<String> getpalabraCalve() {
        return new ArrayList<>(palabraCalve);
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public int calculaEstadistica(Condicion c) {
        if (c.cumple(this)){
            return 1;
        }

        return 0;
    }
}
