package SobreroSeleccionador;

import java.util.ArrayList;

public class CasaEnemistada extends Casa {

    private CasaEnemistada enemiga;

    public CasaEnemistada(String nombre, int maxAl) {
        super(nombre, maxAl);
    }

    public CasaEnemistada getEnemiga() {
        return enemiga;
    }

    public void setEnemiga(CasaEnemistada enemiga) {
        this.enemiga = enemiga;
    }

    // Aceptar: método que usará otra CasaEnemistada para saber
    // si esta casa le permite agregar un alumno
    // ¿Mi enemiga me deja agregar un alumno? Si me tiene como enemiga, no me deja
    public boolean aceptarAlumno(CasaEnemistada otra) {
        return otra.getEnemiga() == null || getEnemiga() == null || !otra.getEnemiga().equals(this);
    }

    // Agregar
    @Override
    public boolean agregarAlumno(Alumno a) {
        if (getAlumnos().size() >= getMaxAl() || a.getCasa() != null || !a.getCualidades().containsAll(getCualidades())) {
            return false;
        }

        if (enemiga != null && !enemiga.aceptarAlumno(this)) {
            return false;
        }

        alumnos.add(a);
        a.setCasa(this);
        return true;
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
            CasaEnemistada casa = (CasaEnemistada) obj;

            return (this.alumnos.containsAll(casa.getAlumnos()) && this.alumnos.size() == casa.getAlumnos().size()) // Mismo alumnos
                    && (this.cualidades.containsAll(casa.getCualidades()) && this.cualidades.size() == casa.getCualidades().size()) // Mismo cualidades
                    && this.getMaxAl() == casa.getMaxAl() // Mismo maxAl
                    && this.getNombre().equals(casa.getNombre()) // Mismo nombre
                    && ((this.getEnemiga() == null && casa.getEnemiga() == null)
                    || (this.getEnemiga() != null && this.getEnemiga().equals(casa.getEnemiga()))); // Misma enemiga
        } catch (Exception e) {
            return false;
        }
    }
}

