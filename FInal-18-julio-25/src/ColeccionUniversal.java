import java.util.ArrayList;

public class ColeccionUniversal extends Wallpaper{


    public ColeccionUniversal(String titulo, int cantdescarga, int fechapublicacion, ArrayList<String> plabraclaves, Usuario usuario) {
        super(titulo, cantdescarga, fechapublicacion, plabraclaves, usuario);
    }

    @Override
    public ArrayList<String> getPlabraclaves() {
        // Retorna una lista especial que siempre contiene cualquier palabra
        return new ArrayList<>(listadoPalabraClave());
    }

    // Método especial para verificar si contiene una palabra
    public boolean contienePalabraClave(String palabra) {
        // SIEMPRE retorna true, sin importar si la tiene en su lista real
        return true;
    }
}
