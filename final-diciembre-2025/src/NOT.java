public class NOT extends Buscador{
    private Buscador buscador;

    public NOT(Buscador buscador) {
        this.buscador = buscador;
    }

    @Override
    public boolean cumple(Comida c) {
        return !buscador.cumple(c);
    }
}
