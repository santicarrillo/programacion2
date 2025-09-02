package establecimientoDeportivo;

public class Cancha {
    private String Tipo;
    private double precio;
    private int cantCanchas;


    public Cancha(String tipo, double precio, int cantCanchas) {
        this.Tipo = tipo;
        this.precio = precio;
        this.cantCanchas = cantCanchas;
    }



    // get and set
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantCanchas() {
        return cantCanchas;
    }

    public void setCantCanchas(int cantCanchas) {
        this.cantCanchas = cantCanchas;
    }


}
