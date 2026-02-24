import java.time.LocalDate;

public class HistorialPrestamo {
    private libro libro;
    private LocalDate fechaPrestamo;  // ✅ Fecha en que tomó el libro
    private LocalDate fechaDevolucion; // ✅ Fecha en que devolvió (null si no devolvió)

    public HistorialPrestamo(libro libro, LocalDate fechaPrestamo) {
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null; // Inicialmente sin devolver
    }

    public libro getLibro() {
        return libro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fecha) {
        this.fechaDevolucion = fecha;
    }

    public boolean fueDevuelto() {
        return fechaDevolucion != null;
    }
}
}
