public class BuscaPrecioMenor extends Buscador{
    private double precioMax;

    public BuscaPrecioMenor(double precioMax) {
        this.precioMax = precioMax;
    }

    @Override
    public boolean cumple(Comida c) {
        return c.getPrecio() < precioMax;
    }
}
