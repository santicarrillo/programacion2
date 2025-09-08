package fabricaDeMuebles;

import java.util.ArrayList;

public class Fabrica {
    private String nombre;
    private ArrayList<Producto>stock;
    private  int maxp=10;

        public Fabrica(Producto stock, String nombre ){
            this.nombre=nombre;
            this.stock= new ArrayList<>(maxp);
        }
    public Producto agregaProducto(Producto p){
       this.stock.add(p);
       return p;
    }
    public double subtotalFabrication(Producto p){
        double total=0;
        for (Producto producto: stock){
            total+=p.getCostoFabricacion();
        }
        return total;
    }

    public double costototalventa(Producto pp){
        double total=0;
        for (Producto p:stock){
            total+=p.valorVenta();
        }
        return total;
    }

    //  getters y setters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getStock() {
        return stock;
    }

    public static void main(String[] args) {
        Producto p1= new Producto("azul",500.00,"silla",20,"roble");
        Producto p2= new Producto("verde",100.00,"mesa",20,"roble");
        Fabrica f1= new Fabrica(p1,"pepito");
        System.out.println(f1.agregaProducto(p1));
        System.out.println("el costo de fabricacion:"+ f1.subtotalFabrication(p2));
        System.out.println("costodeventa"+ f1.costototalventa(p2));
    }



}
