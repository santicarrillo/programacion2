import java.time.LocalDate;

public class CondicionPorTItulo extends  Condicion {
    private String titulo;
    public  CondicionPorTItulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public boolean cumple(Prensa p) {
        return titulo.equals(p.getTitulo());
    }
}
