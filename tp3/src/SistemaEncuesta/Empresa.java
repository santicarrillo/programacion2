package SistemaEncuesta;

import java.util.ArrayList;

public class Empresa {
        private String nombre;
        private ArrayList<Empleado> empleados;
        private ArrayList<Encuesta> encuestas;
        private ArrayList<PersonaEnCuestada> personasEncuestadas;
        private int maxe=20,maxen=10,maxp=10;
// constructor


    public Empresa(ArrayList<Empleado> empleados, ArrayList<Encuesta> encuestas, String nombre, ArrayList<PersonaEnCuestada> personasEncuestadas) {
        this.empleados= new ArrayList<>(maxe);
        this.encuestas = new ArrayList<>(maxen);;
        this.nombre = nombre;
        this.personasEncuestadas = new ArrayList<>(maxp);;
    }

    // get and set
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }



    public ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<PersonaEnCuestada> getPersonasEncuestadas() {
        return personasEncuestadas;
    }

    // metodos

public void agregaEmpleado(Empleado e){
        this.empleados.add(e);
}
public void agregaEncuesta(Encuesta e){
this.encuestas.add(e);
}

public double calcularplus(Empleado e){
        return e.cantdeencuestasRealizadas()*100.0;
}
public int totalencuestasrealizadas(){
        return encuestas.size();
}
}
