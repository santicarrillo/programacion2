import java.util.ArrayList;

public class Combo extends Producto {
    private ArrayList<Producto> productos;

    public Combo(int id, String marca, ArrayList<Producto> productos) {
        super(id, marca);
        this.productos = productos;
    }

    public Combo(int id, String marca) {
        super(id, marca);
    }

    public void addProducto(Producto p) {
        if ( this.getMarca().equals(p.getMarca())) {
            productos.add(p);
        }
    }

    @Override
    protected ArrayList<String> getcaracteristicas() {
        ArrayList<String> result = new ArrayList<>();
        for (Producto p : productos) {
            for (String c: p.getcaracteristicas()){
                if (!result.contains(c)){
                    result.add(c);
                }
            }
        }
        return result;
    }

    @Override
    public int getprecioDeLista() {
        int suma=0;
        for (Producto p : productos) {
            suma+=p.getprecioDeLista();
        }
        return suma;
    }

    @Override
    public Combo getCopia(Descuento d) {
        Combo copia = Cascaron();
        if (d.calculaDescuento(this)>0){
            return copia;
        }
        for (Producto p : productos) {
            Producto aux = p.getCopia(d);
            if (aux != null){
                copia.addProducto(aux);
            }
        }
        if (copia.tineCopias()){
            return copia;
        }
        return null;
    }
    public Combo Cascaron() {
        return new Combo(getId(),getMarca());
    }

    public boolean tineCopias() {
        return !productos.isEmpty();
    }
}
