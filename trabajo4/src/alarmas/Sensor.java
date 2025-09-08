package alarmas;

public class Sensor {
    private String zona;
    private boolean activo;

    public Sensor(String zona) {
        this.activo = false;
        this.zona = zona;
    }
    public String getZona() {
        return zona;
    }

    public boolean isActivo() {
        return activo;
    }

    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }
}
