package agroquimico;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String>estadospatologicos;

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadospatologicos = new ArrayList<>();
    }

    public void addEstadoPatologico(String pat){
        estadospatologicos.add(pat);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    get
}
