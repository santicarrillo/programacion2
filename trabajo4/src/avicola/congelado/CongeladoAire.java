package avicola.congelado;

import java.time.LocalDateTime;

public class CongeladoAire extends ProductoCongelado {
    private double porcentajeN;
    private double porcentajeO;
    private double porcentajeCO2;
    private double porcentajeVaporAgua;

    public CongeladoAire(LocalDateTime fechaVencimiento, int nrolote,
                         int codgsuperalm, LocalDateTime fechaEnvasado, String granjaorigen,
                         double tempMantenimiento, double porcentajeN,double porcentajeO,double porcentajeCO2,double porcentajeVaporAgua ) {
        super(fechaVencimiento, nrolote, codgsuperalm, fechaEnvasado, granjaorigen, tempMantenimiento);
        this.porcentajeN = porcentajeN;
        this.porcentajeO = porcentajeO;
        this.porcentajeCO2 = porcentajeCO2;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }



    public String toString() {
        return super.toString() +
                ", Aire: N=" + porcentajeN + "%, O=" + porcentajeO +
                "%, CO2=" + porcentajeCO2 + "%, H2O=" + porcentajeVaporAgua + "%";
    }

}
