package SobreroSeleccionador;

public class CasaLinaje extends Casa{


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
