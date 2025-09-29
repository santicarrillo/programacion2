import java.time.LocalDate;
import java.util.ArrayList;

public class Videoclub {
    private ArrayList<Alquiler> alquilers;

    public Videoclub() {
        alquilers = new ArrayList<>();
    }

    public ArrayList<Alquiler> getAlquilers() {
        return new ArrayList<>(alquilers);
    }

    public void alquilar(Cliente cliente, ItemAlquiler item, LocalDate fechaLimite) {
        if (!verificarDisponibilidad(item)) {
            System.out.println("El ítem no se puede alquilar.");
            return;
        }
        registrarAlquiler(cliente, item, fechaLimite);
        System.out.println("Alquiler registrado correctamente.");
    }

    public void AgregarAlquiler(Alquiler alquiler) {
        alquilers.add(alquiler);
    }
    // Método que verifica si un ítem está disponible para alquilar
    private boolean verificarDisponibilidad(ItemAlquiler item) {
        return item.sepuedeAlquilar();
    }

    

    // Método para obtener todos los clientes con alquileres vencidos
    public ArrayList<Cliente> clientesConAlquileresVencidos() {
        ArrayList<Cliente> clientesVencidos = new ArrayList<>();
        for (Alquiler a : alquilers) {
            if (a.EstaVencido() && !clientesVencidos.contains(a.getCliente())) {
                clientesVencidos.add(a.getCliente());
            }
        }
        return clientesVencidos;
    }

}
