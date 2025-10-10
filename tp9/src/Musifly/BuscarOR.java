package Musifly;

public class BuscarOR extends Buscar {
    private Buscar b1,b2;

    public BuscarOR(Buscar b1, Buscar b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public boolean cumple(Musica m) {
        return b1.cumple(m) || b2.cumple(m);
    }
}
