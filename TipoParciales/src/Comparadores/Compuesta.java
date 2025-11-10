package Comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compuesta extends Elemento implements Comparator<Elemento> {
    private ArrayList<Elemento> elementos;
    public ArrayList<Elemento> busca(Condicion f, Comparator<Elemento> c) {
        ArrayList<Elemento> result= new ArrayList<>();
        for (Elemento e: elementos){
            ArrayList<Elemento> elementos2= e.busca(f,c);
            result.addAll(elementos2);
        }
        Collections.sort(result, c);
        return result;
    }
}
