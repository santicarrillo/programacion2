package tp11ej2.condicionadore;

import tp11ej2.Figura;

public class Not extends Condicion{
    Condicion c;

    public Not(Condicion c) {
        this.c = c;
    }
    @Override
    public boolean cumple(Figura f){
        return !c.cumple(f);
    }
}
