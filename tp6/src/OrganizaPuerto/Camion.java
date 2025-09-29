package OrganizaPuerto;

import java.time.LocalDateTime;

public class Camion extends ElementoPuerto {

    private int  fechaDeCarga;

    public Camion(String nombre ,int fechaDeCarga) {
        super(nombre);
        this.fechaDeCarga = fechaDeCarga;
    }

    public  int  getFechaDeCarga() {
        return fechaDeCarga;
    }

    @Override

    public int  prioridad() {
        return -fechaDeCarga;
    }
}
