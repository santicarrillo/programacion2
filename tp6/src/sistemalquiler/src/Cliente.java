import java.util.ArrayList;

public class Cliente {
    private String nombre,apellidos;
    private ArrayList<Alquiler>alquilers;

    public Cliente(ArrayList<Alquiler> alquilers, String apellidos, String nombre) {
        this.alquilers = new ArrayList<>();
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public  ArrayList<Alquiler> getAlquilers() {
        return new ArrayList<>(alquilers);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
