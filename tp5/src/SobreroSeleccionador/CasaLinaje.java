package SobreroSeleccionador;

import java.util.ArrayList;

public class CasaLinaje extends Casa{
    private ArrayList<Alumno>alumnos;

    public CasaLinaje(String nombre, int maxAl) {
        super(nombre, maxAl);
        this.alumnos= new ArrayList<>(maxAl);
    }

    @Override
    public boolean agregarAlumno(Alumno a) {
        if (alumnos.size() >= maxAl || a.getCasa() == null || a.getCualidades().containsAll(cualidades) || a.familiarEncasa(this) ) { // trae las cualidades de alumnos  tenga todas de la casa(a.getCualidades().containsAll(cualidades))
            return false;
        } else {
            alumnos.add(a);
            a.setCasa(this);
            return true;
        }
    }

}
