package Noticias;

import java.util.Comparator;

public class ComparTo implements Comparator<Noticia> {
    private Comparator<Noticia> c1;
    private  Comparator<Noticia> c2;

    public ComparTo(Comparator<Noticia> c1, Comparator<Noticia> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Noticia o1, Noticia o2) {
        int result = this.c1.compare(o1, o2);

        if (result == 0) {
            result = this.c2.compare(o1, o2);
        }
        return result;
    }
}
