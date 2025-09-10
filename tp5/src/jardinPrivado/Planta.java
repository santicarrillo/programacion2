package jardinPrivado;

public class Planta {

    private static int contadorId = 0;
    private int id;
    private String nombreCientifico;
    private String nombreComun;
    private String paisOrigen;
    private String fechaCompra;

    public Planta(String nombreCientifico, String nombreComun, String paisOrigen, String fechaCompra) {
        contadorId++;
        this.id = contadorId;
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.paisOrigen = paisOrigen;
        this.fechaCompra = fechaCompra;
    }

    public int getId() {
        return id;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + nombreComun + " (" + nombreCientifico + ") - Origen: " + paisOrigen;
    }
}
