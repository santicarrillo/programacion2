package SobreroSeleccionador;

import java.util.ArrayList;

public class CasaEnemistada extends Casa {

    public CasaEnemistada(String nombre, int maxAl) {
        super(nombre, maxAl);
    }

    @Override
    public boolean agregarAlumno(Alumno a) {
        // reglas generales
       if (alumnos.size() >= maxAl || a.getCasa() != null || !a.getCualidades().containsAll(cualidades)) {
            return false;
        }
        for (Casa enemiga : getEnemigas()) {
            if (enemiga.getAlumnos().contains(a)) {
                return false;
            }
        }
        // si pasa todas las validaciones → lo agregamos
        getAlumnos().add(a);
        a.setCasa(this);
        return true;
    }
}
