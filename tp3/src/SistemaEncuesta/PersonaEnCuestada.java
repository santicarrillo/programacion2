package SistemaEncuesta;

import java.util.ArrayList;

public class PersonaEnCuestada {

    private String nombre, apellido;
    private int edad, dni, Max = 10;
    private ArrayList<Encuesta> encuestaRespondia;



    public PersonaEnCuestada(String nombre, String apellido, int dni, int edad, int max) {
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.encuestaRespondia = new ArrayList<>(max);
        this.nombre = nombre;
        this.Max = max;
    }

    public boolean respondioEncuesta(Encuesta e) {
        for (Encuesta encuesta : encuestaRespondia) {
            if (encuesta.getId() == e.getId()) {
                return true;
            }
        }
        return false;
    }

    public void responderEncuesta(Encuesta e) {
        if (!respondioEncuesta(e)) {
            encuestaRespondia.add(e);       // agrego la encuesta a la lista de la persona
            e.setEnCuestada(this);          // vincula la encuesta con la persona
        }
    }






    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Encuesta> getEncuestaRespondia() {
        return encuestaRespondia;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int max) {
        Max = max;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
