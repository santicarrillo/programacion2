package avicola;

import java.time.LocalDateTime;

public class ProductoRefrigerado extends ProductoFresco {
    private LocalDateTime fechaEnvasado;
    private int codgsuperalm;
    private double tempMantenimiento;
    private String granjaorigen;

    public ProductoRefrigerado(LocalDateTime fechaEnvasado, String granjaorigen, LocalDateTime fechaVencimiento,
                               int nrolote, int codgsuperalm,
                               LocalDateTime fechaEnvasado1, String granjaorigen1, double tempMantenimiento) {
        super(fechaEnvasado, granjaorigen, fechaVencimiento, nrolote);
        this.codgsuperalm = codgsuperalm;
        this.fechaEnvasado = fechaEnvasado1;
        this.granjaorigen = granjaorigen1;
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
