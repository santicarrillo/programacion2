package SistemaEncuesta;

import java.util.ArrayList;
import java.util.Date;

public class Encuesta {
    private int id; // número de encuesta
    private Date fecha;
    private ArrayList<Pregunta> preguntas;
    private ArrayList<Respuesta> respuestas;
    private Empleado empleado;
    private PersonaEnCuestada enCuestada; // la persona que responde
    private int maxp = 10, maxr = 10;

    public Encuesta(PersonaEnCuestada enCuestada, Date fecha, int id,
                    ArrayList<Pregunta> preguntas, ArrayList<Respuesta> respuestas,Empleado empleado,
                    int maxp, int maxr) {
        this.enCuestada = enCuestada;
        this.fecha = fecha;
        this.id = id;
        this.preguntas = new ArrayList<>(maxp);
        this.respuestas = new ArrayList<>(maxr);
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    // getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public PersonaEnCuestada getEnCuestada() {
        return enCuestada;
    }

    public void setEnCuestada(PersonaEnCuestada enCuestada) {
        this.enCuestada = enCuestada;
    }

    // métodos para verificar si ya respondió (se usa desde PersonaEnCuestada)

    public boolean respondioEncuesta() {
        return enCuestada != null;
    }
}
