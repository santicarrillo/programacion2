package SistemaControlGastoPublico;

import java.util.ArrayList;

public class Impuesto {
    private String nombre;
    private double monto;

    public Impuesto(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return nombre + ": $" + monto;
    }

   /*public static void main(String[] args) {
        // Crear un ArrayList de impuestos
        ArrayList<Impuesto> impuestos = new ArrayList<>();

        // Agregar impuestos
        impuestos.add(new Impuesto("imp1", 15000.50));
        impuestos.add(new Impuesto("imp2", 22000.00));
        impuestos.add(new Impuesto("imp3", 18000.75));
        impuestos.add(new Impuesto("imp4", 18000.75));
        impuestos.add(new Impuesto("imp5", 18000.75));

        // Mostrar todos los impuestos
        for (Impuesto imp : impuestos) {
            System.out.println(imp);
        }
    }*/
}

