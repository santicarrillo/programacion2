package FacturacionEmpleados;

import java.util.ArrayList;

public class EmpleadoConBono extends Empleado {
    private ArrayList<Empleado> empleadosSueldos;
    private int minimoVentas;
    private double bonoFijo;

    public EmpleadoConBono(String nombre, String Apellido, long dni, int ventasTotal, int minimoVentas, double bonoFijo) {
        super(nombre, Apellido, dni, ventasTotal);
        this.minimoVentas = minimoVentas;
        this.bonoFijo = bonoFijo;
    }

    public boolean llegoAlBono() {
        return getSueldoTotal() >= minimoVentas;
    }
@Override
        public double getSueldoTotal() {
        return super.getSueldoTotal()+(llegoAlBono()?bonoFijo:0);
        }


}

