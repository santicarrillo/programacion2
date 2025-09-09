package avicola;

import java.time.LocalDateTime;

public class Producto {

    private LocalDateTime fechaVencimiento;
    private int nrolote;

    public Producto(LocalDateTime fechaVencimiento, int nrolote) {
        this.fechaVencimiento = fechaVencimiento;
        this.nrolote = nrolote;
    }

    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getNrolote() {
        return nrolote;
    }

    public void setNrolote(int nrolote) {
        this.nrolote = nrolote;
    }
    public String toString() {
        return "fechaVencimiento: " + fechaVencimiento+", nrolote: " + nrolote;
    }
}
