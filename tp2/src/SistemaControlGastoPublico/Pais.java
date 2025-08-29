package SistemaControlGastoPublico;

import java.util.ArrayList;

public class Pais {
    private ArrayList<Provincia> provincias;
    private String nombre;
    private int habitantes;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }
    public Pais(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.provincias = new ArrayList<>();
    }
    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    public void agregarProvincia(Provincia prov) {
        this.provincias.add(prov);
    }
    public ArrayList<Provincia> provinciasConMayorDeficit() {
        ArrayList<Provincia> resultado = new ArrayList<>();// creo un objeto con todas las provincias q cumplen

        for (int i = 0; i < provincias.size(); i++) {
            Provincia prov = provincias.get(i); // obtener la provincia actual
            if (prov.tieneMayorDeficit()) {
                resultado.add(prov);
            }
        }

        return resultado; // devolvemos la lista de provincias que cumplen
    }

    public static void main(String[] args) {




    }
}
