package Pitufos;

import Pitufos.condiciones.Condicion;

import java.util.ArrayList;

public abstract class GrupoP extends ElePitufo {
    ArrayList<ElePitufo> pitufos;
    ArrayList<String> habilidades;

    public GrupoP(ArrayList<ElePitufo> pitufos, ArrayList<String> habilidades) {
        this.pitufos = pitufos;
        this.habilidades = habilidades;
    }
 public void addElemento(ElePitufo pp){
        pitufos.add(pp);
 }
    @Override
    public ArrayList<String> getHabilidades() {
       ArrayList<String>habilidades =this.habilidades;
        for (ElePitufo pitufo : pitufos) {
            if(!pitufos.contains(pitufo)){
                pitufos.add(pitufo);
            }
        }
        return habilidades;
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

}
