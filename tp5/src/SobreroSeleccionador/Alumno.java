package SobreroSeleccionador;

import java.util.ArrayList;

public class Alumno {
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familias;
    private String nombre;
    private Casa casa;

    // CONSTRUCTOR
    public Alumno(String nombre) {
        this.cualidades = new ArrayList<>();
        this.familias = new ArrayList<>();
        this.nombre = nombre;
        this.casa = null;
    }

    // GETTER AND SETTER
    public ArrayList<String> getCualidades() {
        return new ArrayList<>(cualidades);
    }

    public void agregarCualidad(String cc) {
        if (!cualidades.contains(cc.toUpperCase())) {
            cualidades.add(cc.toUpperCase());
        }
    }

    public ArrayList<Alumno> getFamilias() {
        return new ArrayList<>(familias);
    }

    public void agregarFamilia(Alumno ff) {
        if (!familias.contains(ff)) {
            familias.add(ff);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    // MÉTODO
    public boolean familiarEncasa(Casa c) {
        int i = 0;
        boolean esta = false;

        while (i < familias.size() && !esta) {
            if (familias.get(i).getCasa().equals(c)) { // Redefinir equals
                esta = true;
            } else {
                i++;
            }
        }

        return esta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        try {
            Alumno aa = (Alumno) obj;

            return (this.cualidades.containsAll(aa.getCualidades()) && this.cualidades.size() == aa.getCualidades().size()) // Mismo cualidades
                    && (this.familias.containsAll(aa.getFamilias()) && this.familias.size() == aa.getFamilias().size()) // Mismo familias
                    && this.nombre.equals(aa.getNombre()) // Mismo nombre
                    && this.casa.equals(aa.getCasa()); // Misma casa
        } catch (Exception e) {
            return false;
        }
    }
}
