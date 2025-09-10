package avicola.congelado;
import  avicola.Producto;
import avicola.ProductoRefrigerado;

import java.time.LocalDateTime;

public class ProductoCongelado extends ProductoRefrigerado {
    private LocalDateTime fechaEnvasado;
    private int codgsuperalm;
    private double tempMantenimiento;
    private String granjaorigen;

    public ProductoCongelado(LocalDateTime fechaVencimiento, int nrolote,
                             int codgsuperalm, LocalDateTime fechaEnvasado,
                             String granjaorigen, double tempMantenimiento) {
        super(fechaVencimiento, nrolote);
        this.codgsuperalm = codgsuperalm;
        this.fechaEnvasado = fechaEnvasado;
        this.granjaorigen = granjaorigen;
        this.tempMantenimiento = tempMantenimiento;
    }

    @Override
    public String toString() {
        return super.toString()+ ", codgsuperalm=" + codgsuperalm +
                ", fechaEnvasado=" + fechaEnvasado +
                ", tempMantenimiento=" + tempMantenimiento +
                ", granjaorigen='" + granjaorigen;
    }
}
