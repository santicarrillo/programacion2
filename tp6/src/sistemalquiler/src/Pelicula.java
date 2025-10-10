import java.time.LocalDate;

public class Pelicula extends ItemAlquiler {

    private  String infoPelicula;
    private  int stock;
    private static  int sin_stock=0;

    public Pelicula(String Titulo, LocalDate fechaLimite, Cliente cliente, String infoPelicula, int stock) {
        super(Titulo, fechaLimite, cliente);
        this.infoPelicula = infoPelicula;
        this.stock = stock;
    }

   @Override
    public boolean sepuedeAlquilar(){
        if (this.stock == sin_stock){
            return false;
        }
        return true;
   }


}
