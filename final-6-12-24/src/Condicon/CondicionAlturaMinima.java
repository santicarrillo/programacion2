package Condicon;

public class CondicionAlturaMinima extends Condicion {
        private int alturaMinima;

        public CondicionAlturaMinima(int alturaMinima) {
            this.alturaMinima = alturaMinima;
        }
        public boolean cumple(Miembro m) {
            return alturaMinima <m.getAltura();
        }
}
