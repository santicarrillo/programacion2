package registroEmpresas;
import java.util.*;
class Empresa {
    private List<Persona> personas;

    public Empresa() {
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona p) {
        personas.add(p);
    }

    public String exportarRegistro() {
        StringBuilder sb = new StringBuilder();// hace salto de linea y devuelve la lista del arreglo
        for (Persona p : personas) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
