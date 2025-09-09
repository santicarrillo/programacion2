package avicola;

import java.time.LocalDateTime;

public class ProductoFresco extends Producto{
    private LocalDateTime fechaEnvasado;
    private String granjaorigen;
    public ProductoFresco(LocalDateTime fechaEnvasado, String granjaorigen,LocalDateTime fechaVencimiento, int nrolote) {
        super(fechaVencimiento, nrolote);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaorigen = granjaorigen;
    };

    @Override
    public String toString() {
            return super.toString() + ", Envasado:" + fechaEnvasado +", granjaOrigen:" + granjaorigen;
    }
}
