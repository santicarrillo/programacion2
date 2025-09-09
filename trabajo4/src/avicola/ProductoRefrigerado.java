package avicola;

import java.time.LocalDateTime;

public class ProductoRefrigerado extends Producto {
    private LocalDateTime fechaEnvasado;
    private int codgsuperalm;
    private double tempMantenimiento;
    private String granjaorigen;

    public ProductoRefrigerado(LocalDateTime fechaVencimiento, int nrolote, int codgsuperalm, LocalDateTime fechaEnvasado,
                               String granjaorigen, double tempMantenimiento) {
        super(fechaVencimiento, nrolote);
        this.codgsuperalm = codgsuperalm;
        this.fechaEnvasado = fechaEnvasado;
        this.granjaorigen = granjaorigen;
        this.tempMantenimiento = tempMantenimiento;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Envasado:" + fechaEnvasado +
                ", Codigo de supervicion del organismo alimentaria:" + codgsuperalm +
                ", temperatura de mantenimiento :" + tempMantenimiento +
                ", granja de origen:" + granjaorigen;
    }


}
