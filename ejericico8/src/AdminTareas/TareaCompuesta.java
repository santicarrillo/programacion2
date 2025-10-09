package AdminTareas;

import java.util.ArrayList;

public class TareaCompuesta extends Tarea{
    private ArrayList<Tarea> tareas;
    private String especialidad;
    private double presioTarea;

    public TareaCompuesta(String nombre, String implementacion, String especialidad) {
        super(nombre, implementacion);
        this.especialidad = especialidad;
        this.tareas = new ArrayList<>();
    }
    public void addTarea(Tarea t){
        if (t!=null){
            tareas.add(t);
        }
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    @Override
    public int tiempoEstimado() {
        int total =0;
        for (Tarea t:tareas){
            total += t.tiempoEstimado();
        }
        return total;
    }

    @Override
    public double getCosto() {
        double costo=0;
        for (Tarea t:tareas){
            costo += t.getCosto();
        }
        return costo+this.getCantTareassimples()*presioTarea;
    }

    @Override
    public ArrayList<String> getaccion() {
        ArrayList<String> resultado = new ArrayList<>();
        for (Tarea t : tareas) {
            resultado.addAll(t.getaccion());
        }
        return resultado;
    }

    @Override
    public int getCantTareassimples() {
        int total =0;
        for (Tarea t:tareas){
            total += t.getCantTareassimples();
        }
        return total;

    }
}

