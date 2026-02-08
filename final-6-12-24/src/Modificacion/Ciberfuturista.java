package Modificacion;

public class Ciberfuturista implements Modificacion {
    private String cambiaPlanetaOrigen;
    public Ciberfuturista(String cambiaPlanetaOrigen) {
        this.cambiaPlanetaOrigen = cambiaPlanetaOrigen;
    }
    @Override
    public void aplicar(Traje t){
        t.setPlanetaOrigen(this.cambiaPlanetaOrigen);
    }
}
