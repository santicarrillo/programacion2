package congresoCS.Evaluador;

import congresoCS.Trabajo;

import java.util.ArrayList;

public abstract class Evaluador {
    protected String nombre;
    protected ArrayList<String> temasConocidos;
    protected ArrayList<String> TrabajoSeleccionado;

    public Evaluador(String nombre) {
        this.nombre = nombre;
        this.temasConocidos = new ArrayList<>();
        this.TrabajoSeleccionado = new ArrayList<>();
    }
    public String getnombre() {
        return nombre;
    }
    public void addTemasConocidos(ArrayList<String> temas) {
        this.temasConocidos.addAll(temas);
    }
    public ArrayList<String> getTemasConocidos() {
        return new ArrayList<>(temasConocidos);
    }

    public ArrayList<String> getTrabajoSeleccionado() {
        return new ArrayList<>(TrabajoSeleccionado);
    }

    public boolean conoceAlmenosUno(ArrayList<String> temas) {
        for (String tema:temas){
            if (temasConocidos.contains(tema)){
                return true;
            }
        }
        return false;
    }
    public  boolean esconocetodo(ArrayList<String>tema){
        return temasConocidos.containsAll(tema);
    }
    public void asignarTrabajo(Trabajo t) {
        if (t.puedeserEvaluado(this)) {
            TrabajoSeleccionado.add(t.toString());
        }
    }

    public int cantidadTrabajos() {
        return TrabajoSeleccionado.size();
    }
    public abstract String tipoEvaluador();
}
