package Ejercicio1;

import java.util.ArrayList;

public class ElementoAgro {
    private String nombre;
    // Para Agrocultivo: estados patológicos que tiene
    // Para Agroquimico: estados patológicos que trata
    private ArrayList<String> enfermedades;

    public ElementoAgro(String nombre) {
        this.nombre = nombre;
        this.enfermedades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEnfermedades() {
        return new ArrayList<>(enfermedades);
    }

    public void addEnfermedad(String ee) {
        if (!this.enfermedades.contains(ee)) {
            this.enfermedades.add(ee);
        }
    }
}
