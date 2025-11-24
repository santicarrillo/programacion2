package Coleccionista;


import Coleccionista.condicion.Condicion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coleccion extends Elecolec{
   private static double porsentaje;// get
   private ArrayList<Elecolec>colecciones;

    public Coleccion( ) {
        this.colecciones = new ArrayList<>();
    }

    public void addColeccion(Coleccion c){
        colecciones.add(c);
    }
    public static double getPorsentaje() {
        return porsentaje;
    }

    public static void setPorsentaje(double porsentaje) {
        Coleccion.porsentaje = porsentaje;
    }

    @Override
    public double getvalor() {
        double suma =0;
        for(Elecolec e : colecciones){
            suma+= e.getvalor();
        }
        double extra = suma * getPorsentaje() * CantObj();
        return suma + extra;

    }

    @Override
    public int CantObj() {
        int cant=0;
        for (Elecolec e : colecciones){
            cant+=e.CantObj();
        }
        return cant;
    }

    @Override
    public ArrayList<Objeto> busqueda(Condicion c, Comparator<Objeto> cc) {
        ArrayList<Objeto> resultado = new ArrayList<>();
        for (Elecolec e: colecciones){
            ArrayList<Objeto> aux = e.busqueda(c,cc);
            resultado.addAll(aux);
        }
        Collections.sort(resultado,cc);
        return resultado;
    }

    @Override
    public Coleccion getCopia() {
        Coleccion copia = cascaron();
        for (Elecolec e:colecciones){
            Coleccion ee = getCopia();
            copia.addColeccion(ee);
        }
        return copia;
    }

    public boolean tieneColeccion(){
        return colecciones.isEmpty();
    }
    public Coleccion cascaron(){
        return new Coleccion();
    }

    @Override
    public Coleccion getCopiarestringida(Condicion cc) {
        Coleccion copia = cascaron();
        for (Elecolec c :colecciones){
            Coleccion aux= getCopiarestringida(cc);

            if (aux!=null){
                copia.addColeccion(aux);
            }
        }
        if(copia.tieneColeccion()){
            return copia;
        }
        return null;
    }
}
