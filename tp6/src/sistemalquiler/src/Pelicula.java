import java.time.LocalDate;

public class Pelicula extends ItemAlquiler {

    private  String infoPelicula;
    private  int stock;

    public Pelicula(String Titulo, LocalDate fechaLimite, Cliente cliente, String infoPelicula, int stock) {
        super(Titulo, fechaLimite, cliente);
        this.infoPelicula = infoPelicula;
        this.stock = stock;
    }

   @Override
    public boolean sepuedeAlquilar(){
        if (this.stock == 0){
            return false;
        }
        return true;
   }


}
