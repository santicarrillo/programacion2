package avicola.congelado;

import java.time.LocalDateTime;

public class CongeladoAgua extends ProductoCongelado {
    private int salinidad;
    public CongeladoAgua(LocalDateTime fechaVencimiento, int nrolote,
                         int codgsuperalm, LocalDateTime fechaEnvasado, String granjaorigen,
                         double tempMantenimiento, int  salinidad) {
        super(fechaVencimiento, nrolote, codgsuperalm, fechaEnvasado, granjaorigen, tempMantenimiento);
        this.salinidad = salinidad;
    }

    public String toString() {
        return super.toString() + ", Salinidad: " + salinidad + " g/L";
    }
}
