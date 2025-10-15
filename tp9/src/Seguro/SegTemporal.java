package Seguro;

import Seguro.FormaCalculo.FormaCalculo;

import java.time.LocalDate;

public class SegTemporal extends Seguro {
    private LocalDate ini, fin;
    private Seguro contenido;

    public SegTemporal(String descripcion, long dni, double montoFijo, long poliza, FormaCalculo forma,
                       LocalDate ini, LocalDate fin, Seguro contenido) {
        super(descripcion, dni, montoFijo, poliza, forma);
        this.ini = ini;
        this.fin = fin;
        this.contenido = contenido;
    }

    @Override
    public double CalculaCosto () {
        LocalDate hoy = LocalDate.now();
        if (!hoy.isBefore(ini) && !hoy.isAfter(fin)) {
            return contenido.CalculaCosto(); // delega al seguro contenido
        }
        return 0;
    }

    @Override
    public double getMontoFijo() {
        return contenido.getMontoFijo();
    }

    @Override
    public long getPoliza() {
        return contenido.getPoliza();
    }
}
