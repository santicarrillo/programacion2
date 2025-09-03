package fabricaDeMuebles;

public class Producto {
    private String nombre,color,tipomadera;
    private double peso;
    private double costoFabricacion;


    public Producto(String color, double costoFabricacion, String nombre, double peso, String tipomadera) {
        this.color = color;
        this.costoFabricacion = costoFabricacion;
        this.nombre = nombre;
        this.peso = peso;
        this.tipomadera = tipomadera;
    }

}
