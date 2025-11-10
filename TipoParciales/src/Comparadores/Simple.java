package Comparadores;

import java.util.ArrayList;
import java.util.Comparator;

public class Simple extends Elemento implements Comparator<Elemento> {

    @Override
    public ArrayList<Elemento> busca(Condicion f ,Comparator<Elemento> c) {
       ArrayList<Elemento> result= new ArrayList<>();
        if (f.cumple(this)) {
            result.add(this);
        }
        return result;
    }
}
