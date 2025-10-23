package tp11ej2;

import tp11ej2.condicionadore.Condicion;

public class Figura extends Elemento {

    protected String nombre, album;
    protected int numero;
    protected double precio;

    public  Figura(String nombre, String album, int numero, double precio) {
        this.nombre=nombre;
        this.album = album;
        this.numero = numero;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public int getnumero() {
        return numero;
    }
    public void setnumero(int numero) {
        this.numero = numero;
    }

    @Override
    public double getprecio() {
        return this.precio;
    }

    @Override
    public Elemento copia(Condicion condicion) {
        if (condicion.cumple(this)){
            Elemento copia = new Figura(getNombre(),getAlbum(),getnumero(),getprecio());
            return copia;
        }
        return null;
    }
}

