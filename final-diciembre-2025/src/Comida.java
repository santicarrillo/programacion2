
import java.util.ArrayList;

public class Comida extends menu {
    private String nombre;
    private double tiempoPreparacion;
    private double precio;
    private double caloria;

public Comida(String nombre, double tiempoPreparacion, double precio, double caloria) {
    super();
    this.nombre = nombre;
    this.tiempoPreparacion = tiempoPreparacion;
    this.caloria = caloria;
    this.precio = precio;
}

    @Override
    protected double getPrecio() {
        return precio;
    }

    @Override
    protected double getTiempoPrepa() {
        return tiempoPreparacion;
    }

    @Override
    protected ArrayList<Comida> buscar(Buscador p) {
        ArrayList<Comida> comidas= new  ArrayList<Comida>();
        if(p.cumple(this)) {
        comidas.add(this);
        }
        return  comidas;
    }
    @Override
    protected ArrayList<String> getIngredientes() {
        return new ArrayList<>(ingredientes);
    }

    @Override
    protected double getCaloria() {
        return caloria;
    }
}
