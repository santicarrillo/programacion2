package recuperatorio.recuperatorio.estrategias;

import recuperatorio.modelo.Compra;

import java.util.Comparator;

public class EstrategiaEcologica implements Comparator<Compra> {
    @Override
    public int compare(Compra o1, Compra o2) {
        return Double.compare(o1.getKilometros(), o2.getKilometros());
    }

    @Override
    public String toString() {
        return "Estrategia menor distancia";
    }
}
