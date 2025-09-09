package Sueldos;

public class Empresa {
    protected String nombreEmp,Area,apellidoEmp;
    protected int sueldo;

    public Empresa(String area, String nombreEmp, String apellidoEmp) {
        this.Area = area;
        this.apellidoEmp = apellidoEmp;
        this.nombreEmp = nombreEmp;
    }

    public double sueldo(){
        return 0.0;
    }

    public String toString() {
        return "nombre=" + nombreEmp + ", apellido=" + apellidoEmp + ", Area=" + Area;
    }
}
