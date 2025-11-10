package Comparadores;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Elemento implements Comparator<Elemento> {

    public abstract ArrayList<Elemento> busca(Condicion f,Comparator<Elemento> c);

   /* @Override
    public int compareTo(Elemento o) {
        int result= this.getnombre().compareTo(o.getnombre());
        if (result == 0) {
                 result = this.getedad()-o.getEdad();
            if (result == 0) {
                result = Double this.getpesos() - o.getpesos();
            }else {
                result;
            }
        }
        return result;
    }*/
}
