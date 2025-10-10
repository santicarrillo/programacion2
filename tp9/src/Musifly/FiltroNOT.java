package Musifly;

public class FiltroNOT extends Buscar {
    private Buscar b;
    public FiltroNOT(Buscar b) {
        this.b = b;
    }

    @Override
    public boolean cumple(Musica m) {
        return !b.cumple(m);
    }
}
