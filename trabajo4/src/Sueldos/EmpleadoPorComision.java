package Sueldos;

public class EmpleadoPorComision extends Empresa{
    private double sueldobase;
    private double totalventas;
    private double porsentajeComision;

    public EmpleadoPorComision(String area, String nombreEmp, String apellidoEmp, double porsentajeComision, double sueldoSemanal, double totalventas) {
        super(area, nombreEmp, apellidoEmp);
        this.porsentajeComision = porsentajeComision;
        this.sueldobase = sueldoSemanal;
        this.totalventas = totalventas;
    }
    @Override
    public double sueldo(){
        return sueldobase+(totalventas*porsentajeComision);
    }

}
