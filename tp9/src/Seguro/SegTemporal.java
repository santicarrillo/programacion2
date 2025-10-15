package Seguro;

import Seguro.FormaCalculo.FormaCalculo;
import Seguro.busquedaYfiltro.Buscador;

import java.time.LocalDate;
import java.util.ArrayList;

public class SegTemporal extends Seguro {
    private LocalDate ini, fin;
    private Seguro contenido;
    private double monto ;
    private double poliza;

    public SegTemporal(String descripcion, long dni, Seguro contenido, LocalDate fin, LocalDate ini, double monto, double poliza) {
        super(descripcion, dni);
        this.contenido = contenido;
        this.fin = fin;
        this.ini = ini;
        this.monto = monto;
        this.poliza = poliza;
    }

    @Override
    public double calcularCosto() {
        LocalDate hoy = LocalDate.now();
        if (!hoy.isBefore(ini) && !hoy.isAfter(fin)) {
            return contenido.calcularCosto(); // delega al seguro contenido
        }

        return 0;
    }

    @Override
    public ArrayList<Seguro> buscar(Buscador buscador) {
        ArrayList<Seguro> resultado = new ArrayList<>();
        LocalDate hoy = LocalDate.now();

        if (!hoy.isBefore(ini) && !hoy.isAfter(fin)) {
            resultado.addAll(contenido.buscar(buscador));
        }

        return resultado;
    }


    @Override
    public double getMontoFijo() {
        return monto;
    }

    @Override
    public long getPoliza() {
        return contenido.getPoliza();
    }
}
