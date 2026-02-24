import java.time.LocalDate;

public class GrupoFecha extends GrupoNoticia{

    private LocalDate fechainicio;
    private LocalDate fechafin;
    private LocalDate fechaactual=LocalDate.now();

    public GrupoFecha(String titulo, Condicion calcula, LocalDate fechafin, LocalDate fechainicio) {
        super(titulo, calcula);
        this.fechafin = fechafin;
        this.fechainicio = fechainicio;
    }

    @Override
    public void addPrensa(Prensa prensa) {
        if (fechaactual.isAfter(fechainicio) && fechaactual.isBefore(fechafin)){
            super.addPrensa(prensa);
        }
    }
}
