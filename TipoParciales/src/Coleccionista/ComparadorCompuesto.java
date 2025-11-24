package Coleccionista;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Objeto> {
    Comparator<Objeto> c1;
    Comparator<Objeto> c2;


    public ComparadorCompuesto(Comparator<Objeto> c1, Comparator<Objeto> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Objeto o1, Objeto o2) {
        int resultado = this.c1.compare(o1,o2);
        if (resultado==0){
            resultado = this.c2.compare(o1,o2);
        }
        return resultado;
    }
}
