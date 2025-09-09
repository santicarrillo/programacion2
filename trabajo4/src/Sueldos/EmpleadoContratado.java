package Sueldos;

public class EmpleadoContratado extends Empresa{
    private  double sueldoFijo;


    public EmpleadoContratado(String nombreEmp, String area , String apellidoEmp, int sueldoFijo) {
        super(nombreEmp, apellidoEmp, area);
        this.sueldoFijo = sueldoFijo;

    }
    public double sueldo() {
        return sueldoFijo;
    }


}
