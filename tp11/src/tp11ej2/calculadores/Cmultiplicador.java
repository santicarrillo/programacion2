package tp11ej2.calculadores;

import tp11ej2.FiguritaLimite;

public class Cmultiplicador extends Calculador {

        private int Multiplicador;

        public  Cmultiplicador(int Multiplicador) {
            this.Multiplicador = Multiplicador;
        }

        @Override
        public double calcula(FiguritaLimite fl) {
            double resultado=fl.getprecio()* Multiplicador-fl.getUnidadDis();
                return resultado;
        }
}
