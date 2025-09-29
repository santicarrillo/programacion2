import java.time.LocalDate;

public class Vehiculo extends ItemAlquiler{
    private   String marca;
    private double kms;
    private String patente;
    private boolean sealquila;
    private TipoVehiculo tipo;


    public Vehiculo(String Titulo, LocalDate fechaLimite, Cliente cliente, double kms, String marca, String patente, TipoVehiculo tipo) {
        super(Titulo, fechaLimite, cliente);
        this.kms = kms;
        this.marca = marca;
        this.patente = patente;
        this.sealquila = false;
        this.tipo = tipo;
    }

    @Override
    public boolean sepuedeAlquilar(){
        return !sealquila;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }
}
