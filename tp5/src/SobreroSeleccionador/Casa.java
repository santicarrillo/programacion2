package SobreroSeleccionador;

import java.util.ArrayList;

public class Casa {
    protected ArrayList<Alumno>alumnos;
    protected ArrayList<String>cualidades;
    private ArrayList<Casa> enemigas;
    protected int maxAl;
    private String nombre;

    public Casa(String nombre,int maxAl) {
        this.alumnos = new ArrayList<>(maxAl);
        this.enemigas = new ArrayList<>();
        this.nombre=nombre;
    }
    public void addEnemiga(Casa c) {
        if (!enemigas.contains(c) && !this.equals(c)) {
            enemigas.add(c);
            c.enemigas.add(this); // relación recíproca
        }
    }
    public ArrayList<Alumno>getAlumnos(){
            return new ArrayList<>(alumnos);
    }

    public ArrayList<Casa> getEnemigas() {
        return new ArrayList<>(enemigas);
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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Casa casa = (Casa) obj;
        return nombre.equalsIgnoreCase(casa.nombre);
    }


}
