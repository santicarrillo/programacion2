package establecimientoDeportivo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Turno {
    private ArrayList<Usuario> usuarios;
    private LocalDateTime fecha;
    private int hora;
    private Cancha canchas;

    public  Turno(ArrayList<Usuario> usuarios, Cancha canchas, int hora, LocalDateTime fecha) {
        this.usuarios = new ArrayList<>();
        this.usuarios = usuarios;
        this.fecha = fecha;
        this.hora = hora;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Cancha getCanchas() {
        return canchas;
    }

    public void setCanchas(Cancha canchas) {
        this.canchas = canchas;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }


    public boolean estaEnUltimos2Meses() {
        LocalDate hoy = LocalDate.now();
        LocalDate haceDosMeses = hoy.minusMonths(2);
        return (fecha.isAfter(haceDosMeses.atStartOfDay()) || fecha.isEqual(haceDosMeses.atStartOfDay()))
                && fecha.isBefore(hoy.plusDays(1).atStartOfDay()); // incluye hoy
    }




}
