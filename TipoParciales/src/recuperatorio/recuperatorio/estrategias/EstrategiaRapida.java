package recuperatorio.recuperatorio.estrategias;

import recuperatorio.modelo.Compra;

import java.util.Comparator;

public class EstrategiaRapida implements Comparator<Compra> {
    @Override
    public int compare(Compra o1, Compra o2) {
        return o1.getTiempoEstimado() - o2.getTiempoEstimado();
    }

    @Override
    public String toString() {
        return "Estrategia menor tiempo";
    }
}
