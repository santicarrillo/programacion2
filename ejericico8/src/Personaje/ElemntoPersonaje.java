package Personaje;

public abstract class ElemntoPersonaje {
    private String nombre;

    public ElemntoPersonaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int  getpeso();

    public abstract int getFuerza();

    public abstract int getedad();

    public abstract int cantidadPersonaje();

}
