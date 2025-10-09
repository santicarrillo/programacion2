package AdminTareas;

import java.util.ArrayList;

public abstract  class Tarea {

    private String nombre,implementacion;
    public Tarea(String nombre, String implementacion) {
        this.nombre = nombre;
        this.implementacion = implementacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImplementacion() {
        return implementacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImplementacion(String implementacion) {
        this.implementacion = implementacion;
    }
    public abstract ArrayList<String> getaccion();
    public abstract int tiempoEstimado();
    public  abstract double getCosto();
    public abstract int getCantTareassimples();

}
