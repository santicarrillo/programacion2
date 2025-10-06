package AdminTareas;

import java.util.ArrayList;

public class TareaSimple extends Tarea{
    private String tarea;
    private double Costo;
    private int tiempoEstimado;

    public TareaSimple(String nombre, String implementacion, double costo, String tarea, int tiempoEstimado) {
        super(nombre, implementacion);
        Costo = costo;
        this.tarea = tarea;
        this.tiempoEstimado = tiempoEstimado;
    }

    public void setCosto(double costo) {
        Costo = costo;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }


    @Override
    public double getCosto() {
        return this.Costo;
    }

    @Override
    public int tiempoEstimado() {
        return this.tiempoEstimado;
    }

    @Override
    public ArrayList<String> getaccion() {
        ArrayList<String> acciones = new ArrayList<>();
        acciones.add(this.tarea);
        return acciones;
    }
}

