import java.util.ArrayList;

public  class Local {
    private String nombre;
    private ArrayList<Producto>productos;
    private Descuento descuento;
    public Local(String nombre,Descuento descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.productos = new ArrayList<>();
    }
    public void addProducto(Producto p) {
        productos.add(p);
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return new ArrayList<>(productos);
    }

    public boolean getEstaEnPromocion(Producto p){
        if (productos.contains(p) && descuento.calculaDescuento(p)>0) {
            return true;
        }
        return false;
    }

    public int determinaDescuento(Producto p){
        if (!productos.contains(p)){
            return 0;
        }
        int des = descuento.calculaDescuento(p);

        return p.getprecioDeLista()-des;

    }
    public  ArrayList<Producto> getCopia( ){
        ArrayList<Producto> copia = new ArrayList<>();
        for (Producto p : productos) {
            if(p.getCopia(descuento)!=null){
                copia.add(p.getCopia(descuento));
            }
        }
        return copia;
    }

}
