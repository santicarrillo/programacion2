package Sueldos;

public class EmprleadoHoraExtras  extends Empresa{
    private  double sueldobase,PrecioPorhora;
    private int canthorasExtras;

    public EmprleadoHoraExtras(String area, String nombreEmp, String apellidoEmp, int canthoras, double precioPorhora, double sueldohoras) {
        super(area, nombreEmp, apellidoEmp);
        this.canthorasExtras = canthoras;
        PrecioPorhora = precioPorhora;
        this.sueldobase = sueldohoras;
    }

    @Override
    public double sueldo() {
        return sueldobase +(PrecioPorhora* canthorasExtras);
    }

}
