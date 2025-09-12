package FacturacionEmpleados;

public class Empleado {
    protected String nombre;
    protected String Apellido;
    protected long dni;
    protected int SueldoBase;

    public Empleado(String nombre, String Apellido, long dni, int ventasTotal) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.SueldoBase = ventasTotal;
    }
    // GETTER Y SETTER
    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoTotal() {
        return SueldoBase;
    }


}
