package PrimerParcial;

import PrimerParcial.Calcular.CalculaAp;
import PrimerParcial.filtroybusqueda.Buscar;

import java.util.ArrayList;

public abstract class Agente extends  Comandot{
    private String nombre;
    private int  experiencia;
    private double ingenio;
    private int velocidad;
    private String habilidades;

    public Agente(int experiencia, String habilidades, double ingenio, String nombre, int velocidad) {
        this.experiencia = experiencia;
        this.habilidades = habilidades;
        this.ingenio = ingenio;
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public ArrayList<Agente> buscar(Buscar buscar) {
        ArrayList<Agente> resultado = new ArrayList<Agente>();
        if(buscar.cumple(this))
        resultado.add(this);
        return resultado;
    }

    @Override
    public double getvelocidad() {
        return velocidad;
    }

    @Override
    public double getingenio() {
        return ingenio;
    }

    @Override
    public ArrayList<String> getHabilidades() {
        ArrayList<String> habilidades = new ArrayList<>();
        habilidades.add(this.habilidades);
        return habilidades;
    }
    public abstract double calcular();

}
