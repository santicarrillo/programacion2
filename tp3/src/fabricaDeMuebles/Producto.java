package fabricaDeMuebles;

public class Producto {
    private String nombre;        // "Silla", "Mesa" o "Banco"
    private String color;
    private String tipoMadera;
    private double peso;
    private double costoFabricacion;


    public Producto(String color, double costoFabricacion, String nombre, double peso, String tipomadera) {
        if (!nombre.equalsIgnoreCase("Silla") &&
                !nombre.equalsIgnoreCase("Mesa") &&
                !nombre.equalsIgnoreCase("Banco")) {
            System.out.println("error no existen esos productos");;
        }
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.costoFabricacion = costoFabricacion;
        this.tipoMadera=tipomadera;
        }


    // metodos
    public double valorVenta(){
        return costoFabricacion*35;
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipomadera() {
        return tipoMadera;
    }

    public void setTipomadera(String tipomadera) {
        this.tipoMadera = tipomadera;
    }
}
