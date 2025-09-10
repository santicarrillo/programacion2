package avicola.congelado;
import  avicola.Producto;
import avicola.ProductoRefrigerado;

import java.time.LocalDateTime;

public class ProductoCongelado extends ProductoRefrigerado {
    private LocalDateTime fechaEnvasado;
    private int codgsuperalm;
    private double tempMantenimiento;
    private String granjaorigen;

    public ProductoCongelado(LocalDateTime fechaEnvasado, String granjaorigen, LocalDateTime fechaVencimiento, int nrolote, int codgsuperalm, LocalDateTime fechaEnvasado1, String granjaorigen1, double tempMantenimiento,
                             int codgsuperalm1, LocalDateTime fechaEnvasado2, String granjaorigen2,
                             double tempMantenimiento1) {
        super(fechaEnvasado, granjaorigen, fechaVencimiento, nrolote, codgsuperalm, fechaEnvasado1, granjaorigen1, tempMantenimiento);
        this.codgsuperalm = codgsuperalm1;
        this.fechaEnvasado = fechaEnvasado2;
        this.granjaorigen = granjaorigen2;
        this.tempMantenimiento = tempMantenimiento1;
    }

    @Override
    public String toString() {
        return super.toString()+ ", codgsuperalm=" + codgsuperalm +
                ", fechaEnvasado=" + fechaEnvasado +
                ", tempMantenimiento=" + tempMantenimiento +
                ", granjaorigen='" + granjaorigen;
    }
}
