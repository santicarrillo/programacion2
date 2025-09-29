package OrganizaPuerto;

import java.time.LocalDateTime;

public class Barco extends ElementoPuerto {

       private int  capacidad;

       public  Barco(int  capacidad, String nombre) {
           super(nombre);
           this.capacidad = capacidad;
       }
    public int getcapacidad(){
      return  capacidad;
    }
       @Override
       public  int  prioridad() {
           return capacidad;
       }
}
