package tp11ej2.calculadores;

import tp11ej2.FiguritaLimite;

public class Cresta extends Calculador {

   private int resta;

    public Cresta(int Multiplicador) {
      this.resta = Multiplicador;
    }
    @Override
    public double calcula(FiguritaLimite fl) {
        double resultado= fl.getprecio()-resta;
        if (resultado> fl.getprecio()){
            return resultado;
        }else {
            return fl.getprecio();
        }
    }
}
