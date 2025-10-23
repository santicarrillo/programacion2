package tp11ej2;

import tp11ej2.calculadores.Calculador;
import tp11ej2.condicionadore.Condicion;

public class FiguritaLimite extends Figura{
    private int UnidadDis;//unidad disponibles
    private Calculador calculador;

    public FiguritaLimite(String nombre, String album, int numero, double precio, int unidadDis, Calculador calculador) {
        super(nombre, album, numero, precio);
        UnidadDis = unidadDis;
        this.calculador = calculador;
    }
    public int getUnidadDis() {
        return UnidadDis;
    }
    public double getCalculador() {
        return calculador.calcula(this);
    }

    public void setCalculador(Calculador calculador) {
        this.calculador = calculador;
    }

    @Override
    public double getprecio() {
        return getCalculador();
    }

    @Override
    public Elemento copia(Condicion condicion) {

    }
}
