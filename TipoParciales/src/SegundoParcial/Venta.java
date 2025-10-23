package SegundoParcial;

import java.time.LocalDate;

public abstract class Venta extends SegundoParcial.Empresa {
 private LocalDate fecha;
 private String cod_producto;
 private long dni;
 private int montoVendido;
 private int cantVendidos;

 public Venta(LocalDate fecha, String cod_producto, long dni, int montoVendido, int cantVendidos) {
     this.fecha = fecha;
     this.cod_producto = cod_producto;
     this.dni = dni;
     this.montoVendido = montoVendido;
     this.cantVendidos = cantVendidos;
 }

    @Override
    public int getganacias() {
        return this.montoVendido*this.cantVendidos;
    }

    public abstract int ganaciastotales();
    public abstract int cantproductosVendido();
    public abstract cantTotalVentas();



}
