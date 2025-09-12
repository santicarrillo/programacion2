package FacturacionEmpleados;

public class EmpleadoComision  extends Empleado {
    private  int ventasTotal;
    private double porsentajeComision;

    public EmpleadoComision(String nombre, String Apellido, long dni, int ventasTotal, double porsentajeComision, int  ventasTotal1) {
        super(nombre, Apellido, dni, ventasTotal);
        this.porsentajeComision = porsentajeComision;
        this.ventasTotal = ventasTotal1;
    }
    // metodos


    @Override
    public double getSueldoTotal() {
            return super.getSueldoTotal()+(ventasTotal * porsentajeComision/100.0);
    }
}
