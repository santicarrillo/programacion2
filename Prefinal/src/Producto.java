import java.util.ArrayList;

public abstract class Producto  {
    protected int id;
    protected String marca;

    public Producto(int id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public abstract int getprecioDeLista();
    protected abstract ArrayList<String>getcaracteristicas();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract  Producto getCopia(Descuento d) ;
}
