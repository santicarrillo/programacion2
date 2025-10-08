package AcademiaVitual;

import java.util.ArrayList;
import java.util.List;

public class UnidadOptativa extends UnidadEvaluacion{

    private ArrayList<UnidadEvaluacion> opciones;

    public UnidadOptativa() {
        this.opciones = new ArrayList<>();
    }

    public void addOpcion(UnidadEvaluacion opcion) {
        opciones.add(opcion);
    }
    @Override
    public ArrayList<String> getpreguntas() {
        ArrayList<String> conceptos = new ArrayList<>();
        for (UnidadEvaluacion parte : opciones) {
            for (String concepto : parte.getpreguntas()) {
                if (!conceptos.contains(concepto)) {
                    conceptos.add(concepto);
                }
            }
        }
        return conceptos;
    }

    @Override
    public int getpuntaje() {
        int max = 0;
        for (UnidadEvaluacion u : opciones) {
            max = Math.max(max, u.getpuntaje());
        }
        return max;
    }

    @Override
    public int gettiempoestimado() {
        int max = 0;
        for (UnidadEvaluacion u : opciones) {
            max = Math.max(max, u.gettiempoestimado());
        }
        return max;
    }
}
