public class BuscaTIempoMenor extends Buscador{
    private int tiempoMax;

    public BuscaTIempoMenor(int tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    @Override
    public boolean cumple(Comida c) {
        return c.getTiempoPrepa() < tiempoMax;
    }

}
