package Pitufos;

import Pitufos.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public  class Pitufo extends ElePitufo implements Comparable<Pitufo> {
    private ArrayList<String> habilidades;
    private String nombre;
    private double velocidad;
    private int creatividad;
    private int experiencia;

    public Pitufo( String nombre, double velocidad, int creatividad, int experiencia) {
        this.habilidades = new ArrayList<>();
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.creatividad = creatividad;
        this.experiencia = experiencia;
    }

    public void addHabilidad(String h) {
        habilidades.add(h);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public double getVelocidad() {
        return this.velocidad;
    }

    @Override
    public int getCreatividad() {
        return this.creatividad;
    }




    @Override
    public ArrayList<String> getHabilidades() {
        return new ArrayList<>(habilidades);
    }

    @Override
    public int compareTo(Pitufo o) {
        int result = Integer.compare(this.getExperiencia(), o.getExperiencia());// this.getExperiencia() - o.getExperiencia()
        if (result == 0) {
            result = Double.compare(this.getVelocidad(), o.getVelocidad());
            if (result == 0) {
                result = this.getNombre().compareTo(o.getNombre());
            }
        }
        return result;
    }

    @Override
    public int ContarPitufo(Condicion c) {

        if (c.Cumple(this)) {
            return 1;
        }
        return 0;
    }

    @Override
    public Pitufo getcopia() {
        Pitufo copia = cascaron();
        return copia;
    }
    public Pitufo cascaron(){
        return new Pitufo(getNombre(),getVelocidad(),getCreatividad(),getExperiencia());
    }
}