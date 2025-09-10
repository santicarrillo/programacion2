package registroEmpresas;

import java.util.*;

public class Jerarquico extends Empleado{
        private List<Empleado> empleadosACargo;

        public Jerarquico(String nombre, String apellido, int edad, int legajo, double sueldo) {
            super(nombre, apellido, edad, legajo, sueldo);
            this.empleadosACargo = new ArrayList<>();
        }

        public void agregarEmpleado(Empleado e) {
            empleadosACargo.add(e);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Jerárquico - ").append(nombre).append(" ").append(apellido)
                    .append(" (").append(edad).append(" años)")
                    .append(", Legajo: ").append(legajo).append(", Sueldo: $").append(sueldo);

            if (!empleadosACargo.isEmpty()) {
                sb.append("\n   Empleados a cargo:");
                for (Empleado e : empleadosACargo) {
                    sb.append("\n     - ").append(e.nombre).append(" ").append(e.apellido);
                }
            }
            return sb.toString();
        }
}
