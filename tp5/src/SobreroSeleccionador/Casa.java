package SobreroSeleccionador;

import java.util.ArrayList;

public class Casa {
    private ArrayList<Alumno>alumnos;
    private ArrayList<String>cualidades;
    private int maxAl;
    private String nombre;

    public Casa(String nombre,int maxAl) {
        this.alumnos = new ArrayList<>(maxAl);
        this.nombre=nombre;
    }

    public boolean agregarAlumno(Alumno a) {
        if (alumnos.size() >= maxAl || a.getCasa() != null || !a.getCualidades().containsAll(cualidades)) { // trae las cualidades de alumnos  tenga todas de la casa(a.getCualidades().containsAll(cualidades))
            return false;
        } else {
            alumnos.add(a);
            a.setCasa(this);
            return true;
        }
    }



}
