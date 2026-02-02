package Pitufos;

import Pitufos.condiciones.Condicion;

import java.util.ArrayList;

public abstract class GrupoP extends ElePitufo {
    ArrayList<ElePitufo> pitufos;

    public GrupoP( ) {
        this.pitufos = new ArrayList<>();
    }
 public void addElemento(ElePitufo pp){
        pitufos.add(pp);
 }
    @Override
    public ArrayList<String> getHabilidades() {
        ArrayList<String> resultado = new ArrayList<>();
        for (ElePitufo pitufo : pitufos) {
            for (String c: pitufo.getHabilidades())
            if(!resultado.contains(pitufo)){
                resultado.add(c);
            }
        }
        return resultado;
    }

    @Override
    public int ContarPitufo(Condicion c) {
        int contar=0;
        for (ElePitufo p: pitufos) {
            contar+=p.ContarPitufo(c);
        }
        return contar;
    }

    public void addHabilidad(String h){
            habilidades.add(h);
    }

    @Override
    public abstract double getVelocidad();

    @Override
    public abstract int getCreatividad() ;

    public GrupoP getcopia(){
        GrupoP copia= cascaron();

        for (ElePitufo e: pitufos){
            ElePitufo aux= e.getcopia();// recorre todos los hijos
            copia.addElemento(aux);
        }
        return copia;
    }
    public GrupoP cascaron(){
        return new GrupoP();
    }

}
