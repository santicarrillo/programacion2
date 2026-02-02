public class BuscaMenorCaloria extends Buscador{

    private int maxCalorias;

    public BuscaMenorCaloria(int maxCalorias) {
        this.maxCalorias = maxCalorias;
    }

    @Override
    public boolean cumple(Comida c) {
        return c.getCaloria() < maxCalorias;
    }
}
