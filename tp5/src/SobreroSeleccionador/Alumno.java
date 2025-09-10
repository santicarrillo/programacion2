package SobreroSeleccionador;

import java.util.ArrayList;

public class Alumno {
    private ArrayList<String>cualidades;
    private String nombre ;
    private ArrayList<Alumno>familias;
    private  Casa casa;
    // CONSTRUCTOR
    public Alumno(String nombre) {
        this.cualidades = new ArrayList<>();
        this.familias = new ArrayList<>();
        this.nombre = nombre;
        this.casa= null;
    }

    // GETTER AND SETTER


    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public ArrayList<String> getCualidades() {
        return new ArrayList<>(cualidades);
    }

    public ArrayList<Alumno> getFamilias() {
        return new ArrayList<>(familias);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // METODO
    public boolean familiarEncasa(Casa c){
        int i=0;
        boolean esta=false;
        while (i< familias.size() && !esta){
            if (familias.get(i).getCasa().equals(c)){// re definir equals
                esta=true;
            }   else {
                i++;
            }
        }
        return esta;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alumno alumno = (Alumno) obj;
        return nombre.equalsIgnoreCase(alumno.nombre);
    }

}
