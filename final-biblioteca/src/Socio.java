import java.time.LocalDate;
import java.util.ArrayList;

public class Socio {

    private String nombre;
    private int edad;
    private ArrayList<String>requisitos;
    private ArrayList<HistorialPrestamo>prestamos;

    public Socio(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
        this.requisitos = new ArrayList<>();
    }

    public void addRequisito(String requisito) {
        this.requisitos.add(requisito);
    }
    public void addPrestamos(HistorialPrestamo p){
        this.prestamos.add(p);
    }

    public boolean puedeTomarPrestado(libro libro) {
        // Verificar cada requisito del socio
        for (String req : requisitos) {
            if (!req.cumple(libro, this)) {
                return false;
            }
        }
        return true;
    }

    // ===== MÉTODOS PARA HISTORIAL =====

    public void agregarPrestamo(libro libro) {
        HistorialPrestamo prestamo = new HistorialPrestamo(libro, LocalDate.now());
        prestamos.add(prestamo);
    }

    public void registrarDevolucion(libro libro) {
        for (HistorialPrestamo h : prestamos) {
            if (h.getLibro() == libro && h.getFechaDevolucion() == null) {
                h.setFechaDevolucion(LocalDate.now());
                break;
            }
        }
    }
}

}
