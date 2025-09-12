package SobreroSeleccionador;

import java.util.ArrayList;

public class Casa {
    protected ArrayList<Alumno> alumnos;
    protected ArrayList<String> cualidades;
    private int maxAl;
    private String nombre;

    public Casa(String nombre, int maxAl) {
        this.alumnos = new ArrayList<>();
        this.cualidades = new ArrayList<>();
        this.maxAl = maxAl;
        this.nombre = nombre;
    }

    public ArrayList<Alumno>getAlumnos() {
        return new ArrayList<>(alumnos);
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

    public ArrayList<String> getCualidades() {
        return new ArrayList<>(cualidades);
    }

    public void agregarCualidad(String cc) {
        if (!cualidades.contains(cc.toUpperCase())) {
            cualidades.add(cc.toUpperCase());
        }
    }

    public int getMaxAl() {
        return maxAl;
    }

    public void setMaxAl(int maxAl) {
        this.maxAl = maxAl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
            Casa casa = (Casa) obj;

            return (this.alumnos.containsAll(casa.getAlumnos()) && this.alumnos.size() == casa.getAlumnos().size()) // Mismo alumnos
                    && (this.cualidades.containsAll(casa.getCualidades()) && this.cualidades.size() == casa.getCualidades().size()) // Mismo cualidades
                    && this.maxAl == casa.getMaxAl() // Mismo maxAl
                    && this.nombre.equals(casa.getNombre()); // Mismo nombre
        } catch (Exception e) {
            return false;
        }
    }

}
