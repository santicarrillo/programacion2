import java.util.ArrayList;

public abstract class Prensa {
    protected String titulo;
    protected Condicion calcula;
    protected ArrayList<String> palabraCalve;

    public Prensa(String titulo, Condicion calcula) {
        this.titulo = titulo;
        this.calcula = calcula;
        this.palabraCalve = new ArrayList<>();
    }
    public Condicion getCalcula() {
        return calcula;
    }

    public void setCalcula(Condicion calcula) {
        this.calcula = calcula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract void addPalabra(String palabra);

    public abstract String getCategoria();
    public abstract ArrayList<String> getpalabraCalve();
    public abstract String getContenido();
    public abstract int calculaEstadistica(Condicion c);



}
