package BusquedaDocumento;

import java.util.ArrayList;

public class FiltroPalbraClave extends Buscar{
    String palabraClave;

    public FiltroPalbraClave(String palabraClave) {
        this.palabraClave = palabraClave.toLowerCase();
    }

    @Override
    public boolean cumple(Documento d) {
        for (String palabra : d.getPalabrasClaves()) {
            if (palabra.toLowerCase().equals(palabraClave)) {
                return true;
            }
        }
        return false;
    }

}
