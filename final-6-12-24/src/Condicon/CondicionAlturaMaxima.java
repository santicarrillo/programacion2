package Condicon;

public class CondicionAlturaMaxima extends Condicion {
    private int alturaMax;

    public CondicionAlturaMaxima(int alturaMinima) {
        this.alturaMax = alturaMinima;
    }
    public boolean cumple(Miembro m) {
        return alturaMax >m.getAltura();
    }
}
