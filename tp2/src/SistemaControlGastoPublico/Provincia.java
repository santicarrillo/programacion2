package SistemaControlGastoPublico;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad>ciudades;

    public  Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }
    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public int cantCiudadesDeficit() {
        int total = 0;
        for (int i = 0; i < ciudades.size(); i++) {
            Ciudad c = ciudades.get(i);
            if (c.estaEnDeficit()) {
                total++;
            }
        }
        return total;
    }
    public boolean tieneMayorDeficit() {
        if (ciudades.isEmpty()) {
            return false; // si no hay ciudades, no hay déficit
        }
        return cantCiudadesDeficit() > ciudades.size() / 2;
    }
}
