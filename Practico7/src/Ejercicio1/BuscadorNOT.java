package Ejercicio1;

public class BuscadorNOT extends Buscador {
    private Buscador bb;

    public BuscadorNOT(Buscador bb) {
        this.bb = bb;
    }

    @Override
    public boolean cumple(Agroquimico qq) {
        return !bb.cumple(qq);
    }
}
