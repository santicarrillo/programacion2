package AcademiaVitual;

import java.util.ArrayList;

public class UnidadSecuencial extends UnidadEvaluacion{

    private ArrayList<UnidadEvaluacion>partes;


    public UnidadSecuencial() {
        this.partes = new ArrayList<>();
    }

    public void  addParte(UnidadEvaluacion p){
        if (! partes.contains(p)) {
            partes.add(p);
        }
    }

    @Override
    public ArrayList<String> getpreguntas() {
        ArrayList<String> conceptos = new ArrayList<>();
        for (UnidadEvaluacion p:partes){
           ArrayList<String>subconceptos= p.getpreguntas();
           for (String concepto : subconceptos){
               if (!conceptos.contains(concepto)){
                   conceptos.add(concepto);
               }
           }
        }
    return conceptos;
    }

    @Override
    public int getpuntaje() {
        int total=0;
        for (UnidadEvaluacion u : partes){
            total += u.getpuntaje();
        }
        return total;
    }

    @Override
    public int gettiempoestimado() {
        int total = 0;
        for (UnidadEvaluacion u : partes) {
            total += u.gettiempoestimado();
        }
        return total;
    }
}
