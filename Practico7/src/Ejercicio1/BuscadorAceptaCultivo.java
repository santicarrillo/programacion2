package Ejercicio1;

// Dado un cultivo devolver el listado de agroquímicos que los pueden tratar.
public class BuscadorAceptaCultivo extends Buscador {
    private Agrocultivo aa;

    public BuscadorAceptaCultivo(Agrocultivo aa) {
        this.aa = aa;
    }

    @Override
    public boolean cumple(Agroquimico qq) {
        return !qq.getNoUtilizarEn().contains(aa);
    }
}
