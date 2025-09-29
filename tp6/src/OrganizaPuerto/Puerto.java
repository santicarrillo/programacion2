package OrganizaPuerto;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Puerto {
        private PriorityQueue<ElementoPuerto> colaBarcos;
        private PriorityQueue<ElementoPuerto> colaCamiones;

        public Puerto() {
            colaBarcos = new PriorityQueue<>(Comparator.comparingInt(ElementoPuerto::prioridad).reversed());
            colaCamiones = new PriorityQueue<>(Comparator.comparingInt(ElementoPuerto::prioridad).reversed());
        }

        public void agregarBarco(Barco b) { colaBarcos.add(b); }
        public void agregarCamion(Camion c) { colaCamiones.add(c); }

        public Barco siguienteBarco() { return (Barco) colaBarcos.poll(); }
        public Camion siguienteCamion() { return (Camion) colaCamiones.poll(); }

}
