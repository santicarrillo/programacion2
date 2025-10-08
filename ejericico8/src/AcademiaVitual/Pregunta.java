package AcademiaVitual;

import java.util.ArrayList;

public class Pregunta extends UnidadEvaluacion{
    private String enunciado;
    private int puntaje,tiempoestimado;
    private ArrayList<String> conceptos;
    public Pregunta(String enunciado, int puntaje, int tiempoestimado) {
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.tiempoestimado = tiempoestimado;
        this.conceptos = new ArrayList<>();
    }

    public void addConceptos(String c){
        if (conceptos!=null && !conceptos.contains(c)){
            conceptos.add(c);
        }
    }


    @Override
    public ArrayList<String> getpreguntas() {
        return conceptos;
    }

    @Override
    public int getpuntaje() {
        return this.puntaje;
    }

    @Override
    public int gettiempoestimado() {
        return this.tiempoestimado;
    }
}
