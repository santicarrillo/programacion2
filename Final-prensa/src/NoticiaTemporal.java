import java.time.LocalDate;

public class NoticiaTemporal extends Noticia {

    private LocalDate fechainicio,fechafin;

    private LocalDate fechaActual=LocalDate.now();

    public NoticiaTemporal(String titulo, Condicion condicion, String contenido, String editor, String categoria) {
        super(titulo, condicion, contenido, editor, categoria);
        this.fechainicio=fechainicio;
        this.fechafin=fechafin;
    }

    @Override
    public int calculaEstadistica(Condicion c) {
        if (fechaActual.isAfter(fechainicio) && fechaActual.isBefore(fechafin)&&c.cumple(this)){
            return 1;
        }
        return 0;
    }
}
