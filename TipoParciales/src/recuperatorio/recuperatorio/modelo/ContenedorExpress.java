package recuperatorio.recuperatorio.modelo;

public class ContenedorExpress extends Contenedor{
    private int tiempoDescuento;
    private int tiempoMinimo;

    public ContenedorExpress(int tiempoDescuento, int tiempoMinimo) {
        this.tiempoDescuento = tiempoDescuento;
        this.tiempoMinimo = tiempoMinimo;
    }

    @Override
    public int getTiempoEstimado() {
        int tiempoEstimado = super.getTiempoEstimado() - tiempoDescuento;
        if (tiempoEstimado >= tiempoMinimo)
            return tiempoEstimado;
        else return tiempoMinimo;
    }

    @Override
    protected Contenedor crearContenedor() {
        return new ContenedorExpress(this.tiempoDescuento, this.tiempoMinimo);
    }
}
