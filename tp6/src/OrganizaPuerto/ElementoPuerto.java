package OrganizaPuerto;

import java.time.LocalDateTime;

public abstract class ElementoPuerto {
    private String nombre;

    public  ElementoPuerto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int  prioridad();

}
