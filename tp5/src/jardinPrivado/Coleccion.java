package jardinPrivado;

import java.util.*;

public class Coleccion {
        private List<Planta> plantas;

        public Coleccion() {
            this.plantas = new ArrayList<>();
        }

        public void agregarPlanta(Planta planta) {
            plantas.add(planta);
        }

        public void eliminarPlanta(int id) {
            plantas.removeIf(p -> p.getId() == id);
        }

        public Planta buscarPlantaPorId(int id) {
            for (Planta p : plantas) {
                if (p.getId() == id) {
                    return p;
                }
            }
            return null;
        }

        public Planta buscarPlantaPorNombre(String nombre) {
            for (Planta p : plantas) {
                if (p.getNombreComun().equalsIgnoreCase(nombre)) {
                    return p;
                }
            }
            return null;
        }

        public List<Planta> listarPlantas() {
            return plantas;
        }
}
