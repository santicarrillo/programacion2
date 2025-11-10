package Comparadores;

import java.util.Comparator;

public class ComparatorCompuesto implements Comparator<Elemento> {

    Comparator c1;
    Comparator c2;
    public ComparatorCompuesto(Comparator c1, Comparator c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public int compare(Elemento e1, Elemento e2) {
        int resultado = c1.compare(e1,e2);
        if(resultado==0){
            resultado= c2.compare(e1,e2);
        }
        return resultado;
    }
}
