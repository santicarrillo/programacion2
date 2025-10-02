package Ejercicio1;

// Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada.
public class BuscadorTrataEnfermedad extends Buscador {
    private String ee;

    public BuscadorTrataEnfermedad(String ee) {
        this.ee = ee;
    }

    @Override
    public boolean cumple(Agroquimico qq) {
        return qq.getEnfermedades().contains(ee);
    }
}
