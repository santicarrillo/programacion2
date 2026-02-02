public class OR extends Buscador{

        private Buscador b1;
        private Buscador b2;

        public OR(Buscador b1, Buscador b2) {
            this.b1 = b1;
            this.b2 = b2;
        }

        @Override
        public boolean cumple(Comida c) {
            return b1.cumple(c) || b2.cumple(c);
        }

}
