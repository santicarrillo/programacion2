import java.util.ArrayList;

public class ProductoSimple extends Producto {
    protected int precioLista;
    protected ArrayList<String>categorias;

    public ProductoSimple(int id, String marca, int precioLista) {
        super(id, marca);
        this.categorias = new ArrayList<>();
        this.precioLista = precioLista;
    }


    public void addCategoria(String c) {
            this.categorias.add(c);

    }

    @Override
    protected ArrayList<String> getcaracteristicas() {
        return new ArrayList<>(categorias);
    }

    @Override
    public int getprecioDeLista() {
        return precioLista;
    }

    @Override
    public ProductoSimple getCopia(Descuento d) {
      ProductoSimple copia =  cascaron();
        if (d.calculaDescuento(this)>0) {
            return copia;
        }
        return null;
    }

    public ProductoSimple cascaron( ) {
        ProductoSimple copia= new ProductoSimple(getId(),getMarca(),getprecioDeLista());
        copia.categorias.addAll(categorias);
        return copia;
    }
}
