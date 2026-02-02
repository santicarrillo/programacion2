package Coleccionista;

import java.util.Comparator;

public class Conparadornombre implements Comparator<Objeto> {

    @Override
    public int compare(Objeto o1, Objeto o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
