package AcademiaVitual;

import java.util.ArrayList;

public class UnidadOptativa extends UnidadEvaluacion{

    private ArrayList<UnidadEvaluacion> opciones;

    public UnidadOptativa() {
        this.opciones = new ArrayList<>();
    }

    public void addOpcion(UnidadEvaluacion opcion) {
        opciones.add(opcion);
    }
    @Override
    public ArrayList<String> getConceptos() {
        ArrayList<String> conceptos = new ArrayList<>();
        for (UnidadEvaluacion parte : opciones) {
            for (String concepto : parte.getConceptos()) {
                if (!conceptos.contains(concepto)) {
                    conceptos.add(concepto);
                }
            }
        }
        return conceptos;
    }

    @Override
    public int getCantpuntaje() {
        int max = 0;
        for (UnidadEvaluacion u : opciones) {
            max = Math.max(max, u.getCantpuntaje());
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
