import java.util.ArrayList;

public class Vivero {
    private ArrayList<Planta> plantas;

    public Vivero() {
        this.plantas = new ArrayList<>();
    }

    // Agregar una planta al vivero
    public void agregarPlanta(Planta p) {
        if (p != null) {
            plantas.add(p);
        }
    }

    // Buscar plantas que cumplan una condición
    public ArrayList<Planta> buscar(Buscador condicion) {
        ArrayList<Planta> resultado = new ArrayList<>();
        for (Planta p : plantas) {
            if (condicion.cumple(p)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // Obtener todas las plantas
    public ArrayList<Planta> getPlantas() {
        return new ArrayList<>(plantas); // copia defensiva
    }

    // Mostrar todas las plantas (opcional)
    public void mostrarPlantas() {
        for (Planta p : plantas) {
            System.out.println(p.getNombreCientifico());
        }
    }

    // metodo riego inferior

}