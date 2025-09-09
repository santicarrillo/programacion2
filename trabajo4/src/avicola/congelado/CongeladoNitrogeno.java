package avicola.congelado;

import java.time.LocalDateTime;

public class CongeladoNitrogeno extends ProductoCongelado {
    private String metodo;
    private  int timpoExposicion;

    public CongeladoNitrogeno(LocalDateTime fechaVencimiento, int nrolote, int codgsuperalm, LocalDateTime fechaEnvasado,
                              String granjaorigen, double tempMantenimiento, String metodo, int timpoExposicion) {
        super(fechaVencimiento, nrolote, codgsuperalm, fechaEnvasado, granjaorigen, tempMantenimiento);
        this.metodo = metodo;
        this.timpoExposicion = timpoExposicion;
    }

    public String toString() {
        return super.toString() + ", Metodo: " + metodo + " timpoExposicion: " + timpoExposicion;
    }
}
