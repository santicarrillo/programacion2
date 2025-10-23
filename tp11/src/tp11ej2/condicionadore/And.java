package tp11ej2.condicionadore;

import tp11ej2.Figura;

public class And extends Condicion{
    Condicion c1,c2;
    public And(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Figura f) {
        return c1.cumple(f) && c2.cumple(f);
    }
}
